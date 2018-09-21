pipeline {
    agent any    
       options{
           logging{
            pollLogging true
            pruneDays 20
            target{
                name 'org.techworld.sonar'
                level 'FINE'
            }
        }
    }
   
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
