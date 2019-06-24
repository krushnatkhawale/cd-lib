def call(Map config){

	stage('BUILD'){
		node{
			sh 'chmod +x gradlew'
			sh './gradlew :app:build'
			config.environment = 'dev'
		}
	}

	deployToPreProd config
}