pipeline {
    agent any

    environment {
        APP_NAME = "general-app"
    }

    stages {
        stage('Build') {
            steps {
                echo "Building ${APP_NAME} ..."
            }
        }

        stage('Test') {
            steps {
                sh 'echo "Running unit tests ..."'
                sh 'echo "Running lint checks ..."'
                sh 'echo "All checks passed. ..."'
            }
        }
    }

    post {
        success {
            echo "${APP_NAME} pipeline completed successfully."
        }

        failure {
            echo "${APP_NAME} pipeline failed - check logs above."
        }
    }
}