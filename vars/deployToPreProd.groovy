def call(Map config){

	stage('PRE-PROD DEPLOY'){
		node{

			playbook = 'deployment/playbook/playbook.yml'
			inventory = "deployment/inventory/${config.environment}"

			
			ansiblePlaybook inventory: inventory, playbook: playbook
		}
	}
	cucumber config
}