def call(Map config){


	println "Branch: $env.BRNACH_NAME"
	print "PIPELINE TYPE: " 
	print 
	log.info env.getProperties().toString()
	checkoutSource config

}