pipeline {
    agent any
    stages{
        stage('Build'){
            steps {
                logging{
            pollLogging true
            pruneDays 20
            target{
                name 'org.techworld.sonar'
                level 'FINE'
            }
        }
    }
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