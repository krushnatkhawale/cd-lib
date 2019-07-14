def call(Map config){


	getBranchName

	checkoutSource config

}

def getBranchName(){
	println "Branch: $env.BRNACH_NAME"
	print "PIPELINE TYPE: " 
}