def call(Map config){

	log.info "Pipeline triggered from branch '$config.branchName', type PROD"
	
	config.environment = pipelineUtils.getEnvironmentFor config

	checkoutSource config

	currentBuild.result = "SUCCESS"
}