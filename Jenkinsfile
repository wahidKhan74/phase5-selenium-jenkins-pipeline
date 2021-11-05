pipeline {

    agent any
    
    triggers {
    	pollSCM('* * * * *')
    }
    
    stages {
    	
    	stage('Compile stage') {
            steps {
                echo '-------- This is a compile stage -----'
                sh 'mvn clean compile'
            }
        }
        
        stage('Test stage') {
            steps {
                echo '-------- This is a test stage -----'
                sh 'mvn clean test'
            }
        }
        
        
        stage('Build stage') {
            steps {
                echo '-------- This is a build stage -----'
                sh 'mvn clean package -DskipsTest'
            }
        }        
       
    }
}
