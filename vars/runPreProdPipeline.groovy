def call(Map config){

	log.info "Pipeline triggered from branch '$config.branchName', type PRE-PROD"

	config.environment = pipelineUtils.getEnvironmentFor config
			
	checkoutSource config

	currentBuild.result = "SUCCESS"
}