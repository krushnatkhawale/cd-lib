def call(Map config){

	log.info "Pipeline triggered from branch '$config.branchName', type PROD"
	
	config.environment = getEnvironmentFor config

	checkoutSource config

	currentBuild.result = "SUCCESS"
}