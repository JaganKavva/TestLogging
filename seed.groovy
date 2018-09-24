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
        checkout scm
	    step([
		  $class: 'ExecuteDslScripts',
		  scriptLocation: [targets: ['resources/jenkins/dsl/*.groovy', 'resources/jenkins/dsl/Releases/*.groovy'].join('\n')],
		  removedJobAction: 'DISABLE',
		  removedViewAction: 'DELETE',
		  lookupStrategy: 'JENKINS_ROOT',
		  additionalClasspath: 'resources/jenkins/dsl'
	  ])
            maven('-e clean test')
            echo 'jagan clean test'
        }
}
