def call(Map config){

	log.info "Pipeline triggered for branch '$config.branchName', type PRE-PROD"

	config.environment = pipelineUtils.getEnvironmentFor config
			

	stage("CHECKOUT"){
		node{


			/*
			
			def userInput = input(
			 id: 'userInput', message: 'Let\'s promote?', parameters: [
			 [$class: 'TextParameterDefinition', defaultValue: 'uat', description: 'Environment', name: 'env'],
			 [$class: 'TextParameterDefinition', defaultValue: 'uat1', description: 'Target', name: 'target']
			])
			echo ("Env: "+userInput['env'])
			echo ("Target: "+userInput['target']) 
			*/

			checkoutSource config			
		}
	}

	stage('BUILD'){
		node{

			build config
		}
	}

	stage("${config.environment.toUpperCase()} DEPLOYMENT"){
		node{

			deploy config
		}
	}

	stage('PERFORMANCE TESTS'){
		node{

			performanceTest config
		}
	}
}
