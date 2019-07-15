def getEnvironmentFor(Map config){

	log.info "BranchName: $config.branchName"
	switch(config.branchName) {

		case ~/^master.*/:  
		case ~/^feature.*/: 
							return "dev"

		case ~/^develop.*/: 
							return "prod"

		default: 			failPipeline config
	}
}