def call(Map config){


	println "Branch: $env.BRNACH_NAME"
	print "PIPELINE TYPE: " 

	checkoutSource config

}