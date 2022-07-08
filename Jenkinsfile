pipeline { 
	environment {
		registry = "mofarah7/timesheet"
		registryCredential= 'dockerHub'
		dockerImage = ''
	}
    agent any  
    stages {
        stage("git"){
            steps {
            git branch: 'master',
            url: 'https://github.com/MedFarah/declaration-service.git',
            credentialsId: 'b5259977-6741-44a5-8499-57ec3d76ce2e'
            }
        }
		stage("build project") {
				agent any
				steps {
				  
				  	
					bat 'mvn clean test'
				  
				}
			  }
        
		stage("SonarQube analysis & jacoco code coverage") {
				agent any
				steps {
					bat 'mvn sonar:sonar'
				  
				}
			  }

	
	}

}
