def call(String project, String tag, String user){
	echo "This is building the code"
        sh "docker build -t ${project}:${tag} ."
        echo "Build Complete"
}
