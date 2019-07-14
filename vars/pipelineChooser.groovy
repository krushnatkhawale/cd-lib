def call(Map config){

	def branchName = env.getProperties().environment.BRANCH_NAME
	log.info "Pipeline triggered for branch '$branchName'"

	config.branchName = branchName

	switch(branchName) {
		case ~/^master.*/:  runPreProdPipeline config
							break

		case ~/^develop.*/: runProdPipeline config
							break

		case ~/^feature.*/: runPreProdPipeline config
							break
		default: log.info "Branching naming convention isn't followed, please use valid name"
				 currentBuild.result = "ERROR"
							break
	}

	//checkoutSource config
}