def call(Map config){

	stage("CHECKOUT"){
		node{
			sh 'printenv'

			log.info "just print: $env.BRANCH_NAME"			
			config.each{ log.info "config: $it.key  : $it.value" }
			env.properties.each{ log.info "env: $it.key  : $it.value" }

			def repositoryToCheckout = scm.userRemoteConfigs[0].getUrl()
			git url: repositoryToCheckout
		}
	}
	build config
}