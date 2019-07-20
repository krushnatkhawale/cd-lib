def call(Map config){
			
	def repositoryToCheckout = scm.userRemoteConfigs[0].getUrl()
	
	git url: repositoryToCheckout, branch: env.BRANCH_NAME
}