pipeline {
    agent any 
    tools
   {
    maven 'Maven'
    jdk 'JDK8'
   }
    stages {
       
        stage('Test') { 
            steps {
                echo "Hello it is me"
                sh "mvn clean test " 
                bat "git checkout -b samer"
                bat "git push -u origin samer"
            }
        }
        stage('Deploy') { 
            steps {
                sh "mvn package"
            }
        }
    }
}
