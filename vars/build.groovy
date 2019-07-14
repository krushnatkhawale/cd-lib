def call(Map config){

	stage('BUILD'){
		node{

			config.each{ log.info "config: $it.key  : $it.value" }
			env.properties.each{ log.info "env: $it.key  : $it.value" }


			sh 'chmod +x gradlew'
			sh './gradlew :app:build'
			config.environment = 'dev'
		}
	}

	deployToPreProd config
}