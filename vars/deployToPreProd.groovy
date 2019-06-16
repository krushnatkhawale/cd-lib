def call(Map config){

	stage('PRE-PROD DEPLOY'){
		node{
			sh 'echo PRE-PROD deployment started'

			config.each { echo "[INFO] KRUSH $it.key : $it.value" }

			environment = config.environment

			playbook = 'deployment/playbook/playbook.yml'
			inventory = "deployment/inventory/${environment}/inventory.yml"

			ansiblePlaybook inventory: inventory, playbook: playbook
		}
	}
	cucumber config
}