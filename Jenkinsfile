pipeline {
    agent any

    tools {
        maven 'Maven399'
        jdk 'Java21'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Islan653/Trabalho.git'
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
                bat 'dir target\\surefire-reports' // listar arquivos gerados
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}



