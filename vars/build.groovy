def call(Map config){

	stage('BUILD'){
		node{
			sh './gradlew clean build'
		}
	}
}