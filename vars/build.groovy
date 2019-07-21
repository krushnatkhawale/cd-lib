def call(Map config){

	stage('BUILD'){
		node{

			sh 'chmod +x gradlew'
			sh './gradlew :app:build --rerun-tasks'
		}
	}

	deploy config
}