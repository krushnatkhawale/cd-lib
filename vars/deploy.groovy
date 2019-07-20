def call(Map config){



	playbook = 'deployment/playbook/playbook.yml'
	inventory = "deployment/inventory/${config.environment}"
	
	ansiblePlaybook inventory: inventory, playbook: playbook

}