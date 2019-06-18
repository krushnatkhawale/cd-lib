def call(Map config){

	stage('PRE-PROD DEPLOY'){
		node{

			playbook = 'deployment/playbook/playbook.yml'
			inventory = "deployment/inventory/${config.environment}/inventory.yml"

			ansiblePlaybook inventory: inventory, playbook: playbook --syntax-check
			ansiblePlaybook inventory: inventory, playbook: playbook
		}
	}
	cucumber config
}
