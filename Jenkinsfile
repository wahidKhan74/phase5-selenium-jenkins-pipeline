pipeline {

    agent any
    
    triggers {
    	pollSCM('* * * * *')
    }
    
    stages {
    	
    	stage('Compile stage') {
            steps {
                echo '-------- This is a compile stage -----'
            }
        }
        
        stage('Test stage') {
            steps {
                echo '-------- This is a test stage -----'
            }
        }
        
        
        stage('Build stage') {
            steps {
                echo '-------- This is a build stage -----'
            }
        }        
        
        stage('Deploy stage') {
            steps {
                echo '-------- This is a deploy stage -----'
            }
        }
    }
}