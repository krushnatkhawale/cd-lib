def call(Map config){

	step{
		config.each{ 
			log.info "$it.key  : $it.value" 
		}

		env.each{ 
			log.info "$it.key  : $it.value" 
		}
	}
	
	checkoutSource config
}