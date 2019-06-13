def call(Map config){

	stage('PRE-PROD DEPLOY'){

		node{
			sh 'echo Deploy done'
		}
		checkpoint 'Completed PRE-PROD DEPLOY'
	}
}