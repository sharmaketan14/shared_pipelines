@Library("Shared") _
pipeline{
    agent { label "Slave01" }
    
    stages{
        stage("Hello") {
            steps{
                script{
                    hello()
                }
            }
        }
        stage("Code"){
            steps{
                script{
                    clone("https://github.com/sharmaketan14/django-notes-app.git", "main")
                }
            }
        }
        stage("Build"){
            steps{
                script{
                    build("notes-app", "latest", "sharmaketan14")
                }
            }
        }
        stage("Push to DockerHub"){
            steps{
                script{
                    push("sharmaketan14", "notes-app", "latest")
                }
            }
        }
        stage("Deploy"){
            steps{
                script{
                    deploy()
                }
            }
        }
    }
}
