def getEnvironmentFor(Map config){

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