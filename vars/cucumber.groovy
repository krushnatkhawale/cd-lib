def call(Map config){

	stage('CUCUMBER'){
		node{

			config.each{ log.info "config: $it.key  : $it.value" }
			env.properties.each{ log.info "env: $it.key  : $it.value" }


			sh 'echo Cucumber will be added'
			sh "./gradlew :qa:build -PtestEnvironment=" + config.branchName
		}
	}
}