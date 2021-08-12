package aequilibriumAssessment.stepdefs;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.functions.FunctionLogin;

public class LoginStepDefinitions {
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		Assert.assertTrue(FunctionLogin.isInLoginPage());
	}
	
	@When("I provided the credentials {string} and {string}")
	public void i_provided_the_credentials_and(String username, String password) throws InterruptedException {
		FunctionLogin.enter_credentials(username, password);
	}
	
	
	@And("I try to login")
	public void i_submit_login_page() {
		FunctionLogin.submit();
	}
	
	@Then("I should see the locked-out validation message")
	public void i_should_see_the_lockedOut_validation() {
		Assert.assertTrue(FunctionLogin.hasLockedOutMessage());
	}
	
	@Then("I should see the invalid message")
	public void i_should_see_invalid_message(){
		Assert.assertTrue(FunctionLogin.hasUsernameFieldError());
		Assert.assertTrue(FunctionLogin.hasPasswordFieldError());
		Assert.assertTrue(FunctionLogin.hasInvalidMessage());
	}
	
	@Then("I should see validation messages")
	public void i_should_see_validation_messages() {
		Assert.assertTrue(FunctionLogin.hasUsernameFieldError());
		Assert.assertTrue(FunctionLogin.hasPasswordFieldError());
		Assert.assertTrue(FunctionLogin.hasValidationMessage());
	}
	
	
	@When("username and password is removed")
	public void clear_user_password_fields() {
		FunctionLogin.clearUserPasswordFields();
	}
		
	
	@When("click the remove button of validation message")
	public void should_remove_validation_message() {
		FunctionLogin.close_error_message();		
	}
	
	
	@Then("validation message should not be displayed")
	public void i_should_not_see_invalid_message() {
		Assert.assertFalse(FunctionLogin.hasUsernameFieldError()); 
		Assert.assertFalse(FunctionLogin.hasPasswordFieldError());
		Assert.assertFalse(FunctionLogin.hasInvalidMessage());
	}
	
	@Then("username and password field should be cleared")
	public void is_username_and_password_field_cleared() {
		Assert.assertTrue(FunctionLogin.usernameHasText()); 
		Assert.assertTrue(FunctionLogin.passwordHasText());
	}
	      
	@When("I provided the password value {string} only")
	public void input_password_only(String password) {
		FunctionLogin.enter_password(password);
	}
	
	@When("I provided the username value {string} only")
	public void input_username_only(String username) {
		FunctionLogin.enter_username(username);
	}
	
	@Then("I should see the password validation message")
	public void should_see_the_password_validation() {
		Assert.assertTrue(FunctionLogin.hasPasswordValidationMessage());
	}

	@Then("I should see the username validation message")
	public void should_see_the_username_validation() {
		Assert.assertTrue(FunctionLogin.hasUsernameValidationMessage());
	}
}
