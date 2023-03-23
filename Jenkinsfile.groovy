pipeline {
        agent any
        stages {
            stage('Script-011') {
                steps {
                    script {
                            build job: 'Script-011'
                        }
                    }
               }   
            stage('Script-022') {
                steps {
                    script {
                            build job: 'Script-022'
                        }
                    }
               }   
           }
       }