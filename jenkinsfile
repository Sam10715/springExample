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
                
                bat "mvn clean test e" 
            }
        }
        stage('Deploy') { 
            steps {
                bat "mvn package"
            }
        }
    }
}
