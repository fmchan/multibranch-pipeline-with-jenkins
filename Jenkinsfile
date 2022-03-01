pipeline {
    agent any
    tools {
        gradle 'Gradle-7.4'
    }
    stages {
        stage('Build') {
            steps {
                echo "Executing build"
                bat 'gradlew assemble'
            }
        }
        stage('Test') {
            steps {
                echo "Executing test"
                bat 'gradlew test'
            }
        }
        stage('Build docker image') {
            steps {
                echo "Executing build docker image"
                bat 'gradlew docker'
            }
        }
        stage('Push docker image') {
            steps {
                echo "Executing push docker image"
                bat 'gradlew dockerPush'
            }
        }
        stage('Stop container') {
            steps {
                echo "Stop container"
                bat 'docker stop multibranch || exit 0'
            }
        }
        stage('Remove local image') {
            steps {
                echo "Remove local image"
                bat 'docker rmi fwlok247/multibranch:0.0.1-SNAPSHOT'
            }
        }
        stage('Run container') {
            steps{
                echo "Run container"
                bat 'docker run --rm -d --name multibranch -p 8888:8888 fwlok247/multibranch:0.0.1-SNAPSHOT'
            }
        }
    }
}