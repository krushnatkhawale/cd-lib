def getEnvironmentFor(Map config){

	log.info "BranchName: $config.branchName"
	switch(config.branchName) {

		case ~/^master.*/:  
		case ~/^feature.*/: 
							"dev"
							break

		case ~/^develop.*/: 
							"prod"
							break

		default: 			failPipeline config
	}
}