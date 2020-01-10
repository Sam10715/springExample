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
