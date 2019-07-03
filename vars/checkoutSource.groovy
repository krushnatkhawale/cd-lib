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
			env.each{ 
				log.info "$it.key  : $it.value" 
			}

			git url: "git@github.com:krushnatkhawale/student-service.git"
		}	
	}

	build config
}