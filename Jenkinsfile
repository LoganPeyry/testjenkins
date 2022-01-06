pipeline {
  agent any
  stages {
    stage('stage1') {
      parallel {
        stage('stage1') {
          steps {
            sh '''date








'''
          }
        }

        stage('error') {
          steps {
            sh 'grep user /etc/passwd'
          }
        }

      }
    }

    stage('error') {
      steps {
        sh '''if test `grep -c orsys /etc/passwd` -ne 0
then 
find / -user orsys  > /tmp/orsys
fi
'''
      }
    }

  }
}