def call(Map config){
	
	stage("CHECKOUT"){
		git url: "git@github.com:krushnatkhawale/cd-lib.git"
	}

}