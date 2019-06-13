def call(Map config){

	stage('PRE-PROD DEPLOY'){
		node{
			sh 'echo Deploy done'
		}
	}
	cucumber config
}