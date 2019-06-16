def call(Map config){

	stage('PRE-PROD DEPLOY'){
		node{
			sh 'echo PRE-PROD deployment started'
			ansiblePlaybook inventory: 'deployment/inventory/inventory.yml', playbook: 'deployment/playbook/playbook.yml', colorized: true
		}
	}
	cucumber config
}