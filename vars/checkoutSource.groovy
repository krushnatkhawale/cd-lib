def call(Map config){

	sh 'printenv'
	stage("CHECKOUT"){
		node{

			config.each{ 
				log.info "$it.key  : $it.value" 
			}

			git url: "git@github.com:krushnatkhawale/student-service.git"
		}	
	}

	build config
}