def call(Map config){

	stage('BUILD'){
		sh './gradlew clean build'
	}
}