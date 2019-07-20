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



	currentBuild.result = "SUCCESS"
}