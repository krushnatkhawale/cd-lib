def call(Map config){


	println "Test****************"
	log.info environment.BRANCH_NAME
	log.info env.getProperties().toString()
	println "Finish****************"
	//checkoutSource config

}