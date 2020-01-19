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
                 
                bat "git checkout -b samer"
                bat "git push -u origin samer"
            }
        }
        stage('Deploy') { 
            steps {
                echo "hi"
            }
        }
    }
}
