def call(Map config){

	stage('PRE-PROD DEPLOY'){
		node{
			sh 'echo PRE-PROD deployment started'
			ansiblePlaybook installation: 'Ansible from jenkins', inventory: 'deployment/inventory/inventory.yml', playbook: 'deployment/playbook/playbook.yml'
		}
	}
	cucumber config
}