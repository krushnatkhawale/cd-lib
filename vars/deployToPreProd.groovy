def call(Map config){

	stage('DEPLOY TO DEV'){
		node{

			playbook = 'deployment/playbook/playbook.yml'
			inventory = "deployment/inventory/${config.environment}"

			
			ansiblePlaybook -v inventory: inventory, playbook: playbook 
		}
	}
	cucumber config
}