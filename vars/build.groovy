def call(Map config){

	stage('BUILD'){
		node{
			chmod +x gradlew
			sh './gradlew clean build'
		}
	}
}