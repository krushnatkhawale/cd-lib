def call(Map config){

	stage('CUCUMBER'){
		node{

			sh "./gradlew :qa:build --rerun-tasks -PtestEnvironment=" + config.environment
		}
	}
}