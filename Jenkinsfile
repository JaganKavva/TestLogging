pipeline {
    agent any
    stages{
        stage('Build'){
            steps {
                echo "Test Logging"
            }
            post {
                success {
                    echo 'Now Archiving...'
                }
            }
        }
    }
}
