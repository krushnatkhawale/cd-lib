def call(Map config){

	stage("CHECKOUT"){
		node{

			config.each{ 
				log.info "$it.key  : $it.value" 
			}

			log.info scm.branch

			git url: "git@github.com:krushnatkhawale/student-service.git"

		}	
	}

}