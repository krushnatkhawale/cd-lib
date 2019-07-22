def call(Map config){

	log.info "Pipeline triggered from branch '$config.branchName', type PRE-PROD"

	config.environment = pipelineUtils.getEnvironmentFor config

	stage("CHECKOUT"){
		node{

			checkoutSource config			
		}
	}

	stage('BUILD'){
		node{

			build config
		}
	}

	stage("DEPLOY TO ${config.environment.toUpperCase()}"){
		node{

			deploy config
		}
	}

	stage('CUCUMBER'){
		node{

			cucumber config
		}
	}
}