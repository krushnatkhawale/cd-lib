def call(Map config){

	stage('BUILD'){
		node{
			sh 'chmod +x gradlew'
			sh './gradlew assemble'
			config.environment = 'dev'
		}
	}

	deployToPreProd config
}