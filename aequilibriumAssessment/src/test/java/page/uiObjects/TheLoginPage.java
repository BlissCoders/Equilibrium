package page.uiObjects;

import org.openqa.selenium.By;

public class TheLoginPage {
	
	public static By FIELD_USERNAME = By.id("user-name");
	public static By FIELD_PASSWORD = By.id("password");
	public static By BUTTON_SUBMIT = By.id("login-button");	
	public static By FORM_LOGIN = By.id("login_button_container");
	public static By IMAGE_ROBOT = By.cssSelector("div.bot_column");	
	public static By ERROR_MESSAGE = By.cssSelector("div[class='error-message-container error'] > h3[data-test='error']");
	public static By BUTTON_CLOSE_ERROR_MESSAGE = By.cssSelector("button[class='error-button']");
	public static By ERROR_USERNAME_FIELD = By.cssSelector("input[class='input_error form_input error'][placeholder='Username']"); 
	public static By ERROR_PASSWORD_FIELD = By.cssSelector("input[class='input_error form_input error'][placeholder='Password']"); 
	
	
}
