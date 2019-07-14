def call(Map config){


	println "Branch: $env.BRNACH_NAME"
	print "PIPELINE TYPE: " 
	print env.BRNACH_NAME
	log.info "PRINT TEST"
	checkoutSource config

}