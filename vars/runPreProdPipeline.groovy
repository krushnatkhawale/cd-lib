def call(Map config){

	log.info "Pipeline triggered from branch '$config.branchName', type PRE-PROD"

	config.environment = getEnvironmentFor config
			
	checkoutSource config

	currentBuild.result = "SUCCESS"
}

def getEnvironmentFor(Map config){
	switch(config.branchName) {
		case ~/^master.*/:  "dev"
							break

		case ~/^develop.*/: "prod"
							break

		case ~/^feature.*/: "dev"
							break
		default: 			failPipeline config
							break
	}
}