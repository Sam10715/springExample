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
                
                bat "mvn clean test " 
            }
        }
        stage('Deploy') { 
            steps {
                bat "mvn package"
            }
        }
    }
}
