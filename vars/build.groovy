def call(Map config){

	stage('BUILD'){
		node{
			sh 'chmod +x gradlew'
			sh './gradlew clean build'
		}
		checkpoint 'Completed BUILD'
	}
}