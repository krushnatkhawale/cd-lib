def call(Map config){

  sh "./gradlew :performance-test:build --rerun-tasks -PtestEnvironment=" + config.environment
}