def call(Map config){

	stage("CHECKOUT"){
		node{

			config.each{ 
				log.info "$it.key  : $it.value" 
			}

			env.each{ 
				log.info "$it.key  : $it.value" 
			}

			git url: "git@github.com:krushnatkhawale/cd-lib.git"

		}	
	}

}