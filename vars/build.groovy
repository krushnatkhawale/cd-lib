def call(Map config){


	sh 'chmod +x gradlew'
	sh './gradlew :app:build --rerun-tasks'

	deploy config
}