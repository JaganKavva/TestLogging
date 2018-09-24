def gitUrl = 'git://github.com/JaganKavva/TestLogging'

job('test-job') { 
    job('test-job') {
    options {
     buildDiscarder(logRotator(daysToKeepStr: '180'))
        echo 'Jagan logrotator'
    }

    steps {
        echo 'jagan clean test'
    }
}
