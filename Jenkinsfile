pipeline {
    agent any

    tools {
        maven 'Maven399'
        jdk 'Java21'
    }

    environment {
        MAVEN_OPTS = "-Dmaven.test.failure.ignore=false"
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
            }
        }
    }

    post {
        always {
            echo 'Publicando relatórios de testes...'
            junit allowEmptyResults: true, testResults: '**/target/surefire-reports/*.xml'
        }
    }
}




