def call(Map config){

	log.info '''Branch naming convention isn't followed, please use valid name.
				Branch name found: $config.branchName	'''
	currentBuild.result = "ERROR"

}