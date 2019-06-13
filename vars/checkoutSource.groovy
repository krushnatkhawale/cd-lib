def call(Map config){
	agent any
	stage("CHECKOUT"){
		git url: "git@github.com:krushnatkhawale/cd-lib.git"
	}

}