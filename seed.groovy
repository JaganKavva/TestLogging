def gitUrl = 'git://github.com/JaganKavva/TestLogging'

job('test-job') { 
    options {
     buildDiscarder(logRotator(daysToKeepStr: '180'))
        echo 'Jagan logrotator'
    }
    scm {
            git(gitUrl)
            echo 'jagan giturl'
        }
    triggers {
            scm('*/15 * * * *')
            echo 'jagan trigger'
        }
    steps {
        
            maven('-e clean test')
            echo 'jagan clean test'
        }
}
