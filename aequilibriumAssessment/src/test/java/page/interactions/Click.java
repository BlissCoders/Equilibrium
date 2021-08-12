package page.interactions;

import org.openqa.selenium.By;


public class Click extends WaitElements{
	
	
	public static void clickOn(By by) {		
		waitUntil(by).click();
	}

}
