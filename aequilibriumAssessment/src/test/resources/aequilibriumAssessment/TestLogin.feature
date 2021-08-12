@loginFeature
Feature: Login Features
  These tests will handle all scenarios related to Login Feature

  
  @validUsers 
  Scenario Outline: Login as valid users and expected to be in the inventory page
    Given I am on the login page
    When I provided the credentials "<username>" and "<password>"
    And I try to login
    Then I should be in the inventory page

    Examples: 
      | username  		  				| password    |
      | standard_user    				| secret_sauce|
			|	locked_out_user 				| secret_sauce|
			|	problem_user            | secret_sauce|
			|	performance_glitch_user | secret_sauce|
	
	
	@invalidUser 
  Scenario Outline: Login as invalid user should see the validation
    Given I am on the login page
    When I provided the credentials "<username>" and "<password>"
    And I try to login
    Then I should see the invalid message
    
    Examples:
      | username  		  				| password    |
      |	random_user     				| random_pass |   
      		
			
	@lockedOutUser 
  Scenario Outline: Login as locked-out user should see the validation
    Given I am on the login page
    When I provided the credentials "<username>" and "<password>"
    And I try to login
    Then I should see the locked-out validation message
    
    Examples:
      | username  		  				| password    |
      |	locked_out_user 				| secret_sauce|
      
  
  @validationNotDisplayed 
  Scenario Outline: Login as invalid user and clear fields to not display validation message
		Given I am on the login page
		When I provided the credentials "<username>" and "<password>"
		And I try to login
		Then I should see the invalid message
		When username and password is removed 
		Then validation message should not be displayed
		
		Examples:
      | username  		  				| password    |
      |	random_user      				| random_pass |
      
  
  @closeValidationMessage 
  Scenario Outline: Login as invalid user and clear fields to not display validation message    
    Given I am on the login page
		When I provided the credentials "<username>" and "<password>"
		And I try to login
		Then I should see the invalid message
		When click the remove button of validation message 
		Then validation message should not be displayed 
		
		Examples:
      | username  		  				| password    |
      |	random_user      				| random_pass |  
      
  @clearUsernameAndPassword 
  Scenario Outline: Username and password field should be cleared
   Given I am on the login page
	 When I provided the credentials "<username>" and "<password>"
	 And I try to login
	 Then I should see the invalid message
	 When click the remove button of validation message 
	 Then username and password field should be cleared
	 
	 Examples:
      | username  		  				| password    |
      |	random_user      				| random_pass |   
      
   
   @usernameRequired 
   Scenario: Username as required field
    Given I am on the login page
		When I provided the password value "random_pass" only
		And I try to login
		Then I should see the username validation message  
		
	@passwordRequired 
   Scenario: Password as required field
    Given I am on the login page
		When I provided the username value "random_user" only
		And I try to login
		Then I should see the password validation message
		
	@usernameAndPasswordAreEmpty 
   Scenario: Username and Password are empty
    Given I am on the login page
		When I provided the credentials "" and ""
		And I try to login
		Then I should see validation messages		
	
	#############Not Automatable Tests, since not yet covered by the login feature#############
	#@usernameAndPasswordTooLong
	#Scenario: Username and Password field max text allowed is 8-12 characters only 	
	#Given I am on the login page
	#When I provided the credentials "UsernameTooLong" and "PasswordTooLong"
	#Then I should see a validation message "Username and Password field maximum text is 8-12 characters only"
	
	#@forgotPassword
	#Scenario: User should have the ability to use forgot password 	
	#Given I am on the login page
	#When I click on Forgot Password
	#And I provide my valid username and email
	#Then I should receive forgot password email
	
	#@rememberMe
	#Scenario: User should have the ability to use remember me option	
	#Given I am on the login page
	#When I enter my valid credentials
	#And I click on remember me option
	#Then I should be able to login successfully
	#########################################################################################
		     