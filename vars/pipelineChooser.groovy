def call(Map config){
	config.each{ 
		log.info "$it.key  : $it.value" 
	}

	ENV.each{ 
		log.info "$it.key  : $it.value" 
	}

	checkoutSource config
}