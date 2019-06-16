def call(Map config){

	config.each { echo "echo [INFO] MESSAGE :$it.key : $it.value" }
	stage('PRE-PROD DEPLOY'){
		node{
			sh 'echo PRE-PROD deployment started'

			config.each { echo "echo [INFO] KRUSH $it.key : $it.value" }

			environment = config.environment

			playbook = 'deployment/playbook/playbook.yml'
			inventory = 'deployment/inventory/pre-prod/inventory.yml'

			ansiblePlaybook inventory: inventory, playbook: playbook
		}
	}
	cucumber config
}