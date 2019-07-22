def call(Map config){

	config.branchName = env.getProperties().environment.BRANCH_NAME
	
	switch(config.branchName) {

		case ~/^master.*/:  runProdPipeline config
							break

		case ~/^develop.*/: runPreProdDevelopPipeline config
							break

		case ~/^feature.*/: runPreProdFeaturePipeline config
							break

		default: 			failPipeline config
							break
	}
}