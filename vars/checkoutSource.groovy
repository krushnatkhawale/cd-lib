def call(Map config){

	stage("CHECKOUT"){
		node{
			log.info '===================== printenv ======================'
			sh 'printenv'
			log.info '====================== config ======================='
			config.each{ 
				log.info "$it.key  : $it.value" 
			}
			echo 'Pulling...' + env.BRANCH_NAME
			log.info '====================== env ======================='
			env.properties.each{ 
				log.info "$it.key  : $it.value" 
			}

			log.info '====================== CHECKOUT ======================='
			def repositoryToCheckout = scm.userRemoteConfigs[0].getUrl()

			git url: repositoryToCheckout
			
		}
	}

//	build config
}