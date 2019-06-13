def call(Map config){
	config.forEach( (k,v) ->{
		log.info(k + " " + v)
	})
}