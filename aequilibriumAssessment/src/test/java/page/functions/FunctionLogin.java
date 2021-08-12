package page.functions;

import page.interactions.Interactions;
import page.uiObjects.TheLoginPage;

public class FunctionLogin extends Interactions{
	
	public static void enter_username(String username) {
		typeOn(TheLoginPage.FIELD_USERNAME, username);
	}
	
	public static void enter_password(String password) {
		typeOn(TheLoginPage.FIELD_PASSWORD, password);
	}
	
	public static void enter_credentials(String username, String password) {
		enter_username(username);
		enter_password(password);		
	}		
	
	public static void submit() {
		clickOn(TheLoginPage.BUTTON_SUBMIT);
	}
	
	public static boolean hasValidationMessage() {
		if (!isVisible(TheLoginPage.ERROR_MESSAGE))
			return false;
		
		return findElement(TheLoginPage.ERROR_MESSAGE).getText().length() > 0 ? true : false;
	}
	
	private static boolean hasMessage(String message) {
		
		if (!isVisible(TheLoginPage.ERROR_MESSAGE))
			return false;
		
		return findElement(TheLoginPage.ERROR_MESSAGE).getText().contains(message);
	}
	
	public static boolean hasLockedOutMessage() {		
		return hasMessage("Sorry, this user has been locked out.");
	}
	
	public static boolean isInLoginPage() {
	  
		boolean isValid = findElement(TheLoginPage.BUTTON_SUBMIT).isDisplayed();
		isValid = findElement(TheLoginPage.FORM_LOGIN).isDisplayed();
		isValid = findElement(TheLoginPage.IMAGE_ROBOT).isDisplayed();
		
		return isValid;
	
	}
	
	public static boolean hasInvalidMessage() {
		return hasMessage("Username and password do not match any user in this service");
	}
	
	public static boolean hasPasswordValidationMessage() {
		return hasMessage("Password is required");
	}
	
	public static boolean hasUsernameValidationMessage() {
		return hasMessage("Username is required");
	}
	
	public static void clearUserPasswordFields() {
		clearText(TheLoginPage.FIELD_USERNAME);
		clearText(TheLoginPage.FIELD_PASSWORD);
	}
	
	public static void close_error_message() {
		clickOn(TheLoginPage.BUTTON_CLOSE_ERROR_MESSAGE);
	}	
	
	public static boolean hasUsernameFieldError() {
	   	return isVisible(TheLoginPage.ERROR_USERNAME_FIELD);
	}
	
	public static boolean hasPasswordFieldError() {
		return isVisible(TheLoginPage.ERROR_USERNAME_FIELD);
	}
	
	public static boolean passwordHasText() {
		return hasText(TheLoginPage.FIELD_PASSWORD);
	}
	
	public static boolean usernameHasText() {
		return hasText(TheLoginPage.FIELD_USERNAME);
	}

}
