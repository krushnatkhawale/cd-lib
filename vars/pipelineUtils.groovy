def getEnvironmentFor(Map config){

	log.info "BranchName: $config.branchName"
	
	switch(config.branchName) {

		case ~/^master.*/:  
							return "prod"

		case ~/^feature.*/: 
							return "dev"

		case ~/^develop.*/: 
							return "dev"

		default: 			failPipeline config
	}
}