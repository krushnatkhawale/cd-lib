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


			log.info '====================== SCM ======================='
			log.info scm
			scm.userRemoteConfigs.each{
				log.info "confs: " it
			}
			//git url: "git@github.com:krushnatkhawale/student-service.git"
		}	
	}

//	build config
}