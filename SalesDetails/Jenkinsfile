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
                git url: 'https://github.com/AJABHIMANYU/car-sales-service.git', branch: 'master'
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
                bat 'docker rm -f sales-sr || true'
                bat 'docker rmi -f sales-service || true'
                bat 'docker build -t sales-service .'
                bat 'docker run --network demoproject_app-network -p 9869:9869 -d --name sales-sr sales-service'
            }
        }
    }
}
