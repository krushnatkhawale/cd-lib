def call(Map config){


	println "Test****************"
	print env.getProperties().environment.BRANCH_NAME
	println "Finish****************"
	//checkoutSource config

}