def call(Map config){


	println "Branch: $env.BRNACH_NAME"
	print "PIPELINE TYPE: " 
	print env
	log.info env.BRNACH_NAME
	checkoutSource config

}