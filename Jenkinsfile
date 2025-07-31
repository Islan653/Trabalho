pipeline {
    agent any

    tools {
        maven 'Maven399'
        jdk 'Java21'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Islan653/Trabalho.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}

