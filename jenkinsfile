pipeline {
    agent any

    tools {
        maven 'Maven_3.8.6' // ou o nome que você cadastrou no Jenkins
        jdk 'Java_17' // ou sua versão
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://seurepositorio.git' // ou deixe assim se estiver usando SCM
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
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
