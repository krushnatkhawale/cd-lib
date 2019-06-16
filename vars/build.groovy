def call(Map config){

	stage('BUILD'){
		node{
			sh 'chmod +x gradlew'
			sh './gradlew assemble'
			config.environment = 'pro-prod'
		}
	}

	deployToPreProd config
}