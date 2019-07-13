def call(Map config){

	stage("CHECKOUT"){
		node{
			sh 'printenv'

			config.each{ log.info "config: $it.key  : $it.value" }
			env.properties.each{ log.info "env: $it.key  : $it.value" }

			def repositoryToCheckout = scm.userRemoteConfigs[0].getUrl()
			log.info "CHECKING OUT: $repositoryToCheckout, branch: $env.BRANCH_NAME"
			git url: repositoryToCheckout version: $env.BRANCH_NAME
		}
	}
	build config
}