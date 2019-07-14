def call(Map config){

	log.info '''
		Branch naming convention isn't followed, please use valid name.
		Branch name must follow following pattern, feature-XXXXXXXX'''
	currentBuild.result = "ERROR"

}