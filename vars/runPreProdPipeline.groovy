def call(Map config){

	log.info "Pipeline triggered from branch '$config.branchName', type PRE-PROD"

	config.environment = getEnvironmentFor config
			
	checkoutSource config

	currentBuild.result = "SUCCESS"
}

def getEnvironmentFor(Map config){
	def call(Map config){

	config.branchName = env.getProperties().environment.BRANCH_NAME
	
	switch(config.branchName) {
		case ~/^master.*/:  runPreProdPipeline config
							break

		case ~/^develop.*/: runProdPipeline config
							break

		case ~/^feature.*/: runPreProdPipeline config
							break
		default: 			failPipeline config
							break
	}
}
}