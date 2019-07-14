def call(Map config){

	def branchName = env.getProperties().environment.BRANCH_NAME
	log.info "Pipeline triggered for branch '$branchName'"
	
	switch(branchName) {
		case ~/^master.*/:
		log.info "Executing pipeline type PRE-PROD"
			
		break
		case ~/^develop.*/:
		log.info "Executing pipeline type PROD"
			
		break
		case ~/^feature.*/:
		log.info "Executing pipeline type PRE-PROD"
			
		break
		default:
		log.info "Branching naming convention isn't followed, please use valid name"
			
		break
	}

	//checkoutSource config
}