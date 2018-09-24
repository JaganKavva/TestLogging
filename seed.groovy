def gitUrl = 'git://github.com/test/test'

job('test-job') {
    options {
     buildDiscarder(logRotator(daysToKeepStr: '180'))
    }
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
