def call(Map config){

	stage('CUCUMBER'){
		node{
			sh 'echo Cucumber will be added'
			sh './gradlew :qa:build -PtestEnvironment=$env.BRNACH_NAME'
		}
	}
}