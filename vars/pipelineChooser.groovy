def call(Map config){


	println "Test****************"
	 env.getProperties().getProperties().each{ print it }
	println "Finish****************"
	//checkoutSource config

}