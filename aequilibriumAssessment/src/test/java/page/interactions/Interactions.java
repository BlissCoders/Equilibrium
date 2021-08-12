package page.interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Interactions {
	
	public static void clickOn(By by) {
		Click.clickOn(by);
	}
	
	public static void typeOn(By by, String valueText) {
		Type.typeValue(by, valueText);
	}
	
	public static String getCurrentUrl() {
		return Navigate.getUrl();
	}
	
	
	public static WebElement findElement(By by) {
		return WaitElements.findElement(by);
	}
	
	public static List<WebElement> findElements(By by) {
		return WaitElements.findElements(by);
	}
	
	public static void clearText(By by) {
		Type.clearText(by);
	}
	
	public static boolean isVisible(By by) {
		boolean isDisplayed = false;
		
		try {
		
			//isDisplayed = WaitElements.findElement(by).getSize().height > 0 ? true: false;
			isDisplayed = WaitElements.findElement(by).isDisplayed();
		
		}
		catch(Exception ex) {
			ex.getMessage();			
		}
		
		return isDisplayed;
	}	
	
	public static boolean hasText(By by) {
		
		return findElement(by).getText().length() > 0 ? true : false;
	}

}
