def call(Map config){

	stage("CHECKOUT"){
		node{
			sh 'printenv'

			config.each{ log.info "config: $it.key  : $it.value" }
			env.properties.each{ log.info "env: $it.key  : $it.value" }

			def repositoryToCheckout = scm.userRemoteConfigs[0].getUrl()
			config.BRNACH_NAME = "$env.BRANCH_NAME"

			log.info "CHECKING OUT1: $repositoryToCheckout, branch: $config.BRANCH_NAME"
			log.info "CHECKING OUT2: $repositoryToCheckout, branch: $env.BRANCH_NAME"
			git url: repositoryToCheckout version: $env.BRANCH_NAME
		}
	}
	build config
}