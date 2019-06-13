def call(Map config){
	config.each{ 
	
		log.info "PROPERTY : VALUE" 
		log.info "$it.key  : $it.value" 
	
	}
}
