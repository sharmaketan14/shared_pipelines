def call(String user, String project, String tag){
	echo "This is pushing the image to Docker Hub."
	withCredentials([usernamePassword(
                'credentialsId':"dockerHubCred",
                passwordVariable:"dockerHubPass",
                usernameVariable:"dockerHubUser")]){
			sh "docker login -u ${user} -p ${env.dockerHubPass}"
            		sh "docker image tag ${project}:${tag} ${user}/${project}:${tag}"
            		sh "docker push ${user}/${project}:${tag}"
        	}
}
