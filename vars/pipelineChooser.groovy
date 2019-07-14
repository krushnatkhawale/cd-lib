def call(Map config){


	println "Branch: $env.BRNACH_NAME"
	print "PIPELINE TYPE: " 
	print env
	log.info "PRINT TEST"
	checkoutSource config

}