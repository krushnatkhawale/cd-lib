def call(Map config){

	stage("CHECKOUT"){
		node{
			log.info '===================== printenv ======================'
			sh 'printenv'
			log.info '===================== config ======================'
			config.each{ 
				log.info "$it.key  : $it.value" 
			}

			git url: "git@github.com:krushnatkhawale/student-service.git"
		}	
	}

	build config
}