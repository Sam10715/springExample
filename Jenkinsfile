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
            }
        }
        stage('Deploy') { 
            steps {
                sh "mvn package"
            }
        }
    }
}
