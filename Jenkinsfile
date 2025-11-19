pipeline {
  agent any
  tools {
    maven 'devops-maven'
  }
  triggers{
    githubPush()
  }
  environment{
    POM="JugandoArreglos/pom.xml"
  }
  stages{
    stage('Descarga') {
      steps{
        git url: 'https://github.com/xitflor41/JugandoArreglos.git', branch: 'main'
      }
    }
    stage('Compilacion'){
      steps{
        sh 'mvn -f $POM -B'
      }
    }
    stage('Prueba'){
      steps{
        sh 'mvn -f $POM test'
      }
      post{
        always{
          junit 'JugandoArreglos/target/surefire-reports/*.xml'
        }
      }
    }
    stage('Empaquetado'){
      steps{
        sh 'mvn -f $POM package'
        archiveArtifacts artifacts: 'JugandoArreglos/target/*.jar', fingerprint:true
      }
    }
  }
}
