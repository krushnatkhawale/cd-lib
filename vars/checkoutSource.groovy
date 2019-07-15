def call(Map config){

	stage("CHECKOUT"){
		node{
			
			def repositoryToCheckout = scm.userRemoteConfigs[0].getUrl()
			
			git url: repositoryToCheckout, branch: env.BRANCH_NAME
		}
	}
	build config
}