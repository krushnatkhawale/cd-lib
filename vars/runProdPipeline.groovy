def call(Map config){

	log.info "Pipeline triggered from branch '$config.branchName', type PROD"
	
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

	stage("${config.environment.toUpperCase()} DEPLOYMENT"){
		node{

			deploy config
		}
	}

	currentBuild.result = "SUCCESS"
}
