pipeline { 
	environment {
		registry = "mofarah7/timesheet"
		registryCredential= 'dockerHub'
		dockerImage = ''
	}
    agent any  
    stages {
       
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
		
	    	    stage('Deploy') {
       				steps {
				  
				  	
					bat 'mvn clean install'
				  
				}
			}
	
	}

}
