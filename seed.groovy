def gitUrl = 'git://github.com/JaganKavva/TestLogging'

job('test-job') {    
    scm {
        git(gitUrl)
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}
