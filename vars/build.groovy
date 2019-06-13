def call(Map config){

	stage('BUILD'){
		node{
			sh 'chmod +x gradlew'
			sh './gradlew build'
		}
	}
	deployToPreProd config
}