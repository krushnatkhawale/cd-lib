def call(Map config){

	stage('CUCUMBER'){
		node{

			sh "./gradlew :qa:build -PtestEnvironment=" + config.environment
		}
	}
}