pipeline {
    agent any
    tools {
        maven 'my-maven'
        jdk 'my-jdk'
    }

    stages {
        stage('Git') {
            steps {
                echo 'Pull code from GitHub'
                git url: 'https://github.com/AJABHIMANYU/car-eureka.git', branch: 'master'
            }
        }
        stage('Build') {
            steps {
                echo 'Build project using Maven'
                bat "mvn clean install -DskipTests"
            }
        }
        stage('Test') {
            steps {
                echo 'Test your application'
                bat "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy the project'
                bat 'docker rm -f eureka-server-sr || true'
                bat 'docker rmi -f eureka-server || true'
                bat 'docker build -t eureka-server .'
                bat 'docker run --network demoproject_app-network -p 8761:8761 -d --name eureka-server-sr eureka-server'
            }
        }
    }
}
