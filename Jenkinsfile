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

        stage('stage11') {
          steps {
            sh 'grep user /etc/passwd'
          }
        }

      }
    }

    stage('stage2') {
      steps {
        sh '''if test `grep -c orsys /etc/passwd` -ne 0
then 
find / -user orsys  > /tmp/orsys
fi
'''
      }
    }

    stage('stage3') {
      steps {
        sh '''for i in `cat /tmp/orsys`
do 
ls -il $i
done
'''
      }
    }

  }
}