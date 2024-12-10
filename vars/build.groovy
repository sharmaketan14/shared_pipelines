def call(String project, String tag, String user){
	echo "This is building the code"
        sh "sudo docker build -t ${user}/${project}:${tag} ."
        echo "Build Complete"
}
