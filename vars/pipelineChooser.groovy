def call(Map config){

	var branchName = env.getProperties().environment.BRANCH_NAME
	log.info "Pipeline triggered for branch '$branchName'"
	println "Test****************"
	print env.getProperties().environment.BRANCH_NAME
	println "Finish****************"
	//checkoutSource config

}