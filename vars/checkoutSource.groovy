def call(Map config){

	stage("CHECKOUT"){
	
		config.each{ 
			log.info "$it.key  : $it.value" 
		}

		env.each{ 
			log.info "$it.key  : $it.value" 
		}

		git url: "git@github.com:krushnatkhawale/cd-lib.git"
	}

}