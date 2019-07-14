def call(Map config){

	log.info "Branch naming convention isn't followed, please use valid name."
	currentBuild.result = "ERROR"

}