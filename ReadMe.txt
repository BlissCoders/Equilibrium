The Test automation framework was built using Maven Project and Java as programming language and Cucumber as automation framework with Selenium.

Installation you will need the following:

1. JAVA SE/JDK - version 15.0.1
   https://www.oracle.com/java/technologies/javase-downloads.html

2. MAVEN - version 3.8.1 
   https://maven.apache.org/download.cgi

3. Eclipse or IntelliJ IDEA (I used eclipse for this project)
   https://www.eclipse.org/
   https://www.jetbrains.com/idea/

4. Install Cucumber Eclipse plugin or IntelliJ IDEA Cucumber for Java plugin.
   https://github.com/cucumber/cucumber-eclipse/blob/main/README.md
   https://plugins.jetbrains.com/plugin/7212-cucumber-for-java 

5. Once all necessary tools are installed, you may now import your project into your workspace using Eclipse or Intellij.
   And make sure that you can buil the project without errors.

Tests Executions:
 Note: Test Suite is consists of mix positive and negative tests, so the test result will have some failed status to show the screenshot feature, 
       which will be seen in the last Hooks After Step with a .png file type.

1. You can execute the tests using maven cli commands by opening a terminal or command prompt and making sure that you are in the current project folder 
   name "Aequilibrium/aequilibriumAssessment/"
  
2. Here are the list of the tags available:
   1. To run all the tests as one feature
      - @loginFeature
   2. To run each tests per tag scenarios:
      - @validUsers
      - @invalidUser
      - @lockedOutUser
      - @validationNotDisplayed 
      - @closeValidationMessage
      - @clearUsernameAndPassword
      - @usernameRequired	  
	  - @passwordRequired
	  - @usernameAndPasswordAreEmpty

3. I have created batch files to easily run the tests and you'll be able to choose from either running on "Chrome" or "Firefox" browsers
   When you wan to use chrome or firefox, just use the command: run\chrome.bat <tags here> or run\firefox.bat <tags here>
   Sample command: 
   F:\GitHub\Aequilibrium\aequilibriumAssessment>run\chrome.bat @validUsers

4. The test results are saved in the project folder under target\cucumber-jvm-reports\cucumber-html-reports
   You may want to view the overview report using the "overview-features.html" with screenshots for failed tests.
   For json and xml report files are all in target folder
   
   