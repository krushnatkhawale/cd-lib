def call(Map config){

	stage('CUCUMBER'){
		node{
			sh 'echo Cucumber will be added'
			sh './gradlew :qa:build -PtestEnvironment=$config.BRNACH_NAME'
		}
	}
}