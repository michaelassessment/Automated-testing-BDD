Maven Automated Test Project for Benchmark autuomated test evaluation
==========================
This is a maven project. The project consists of a root pom file.
The mvn command is executed by navigating to the folder containing the pom.xml file and by running the command below using the console 

##Tests

- Command line: Go/to/your/project/directory where the pom.xml file is located using the console and run the below command


	```
	mvn clean verify serenity:check -Dcucumber.options="--tags @test4"
	```

- The test report can be found in folder `{projectDir}/target/serenity/index.html`
