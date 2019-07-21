def call(Map config){

			sh "./gradlew :qa:build --rerun-tasks -PtestEnvironment=" + config.environment

}