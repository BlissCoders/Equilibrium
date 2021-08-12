package page.interactions;

import org.openqa.selenium.By;

public class Type extends WaitElements{
	
	public static void typeValue(By by, String valueText) {
		waitUntil(by).sendKeys(valueText);
	}
	
	public static void clearText(By by) {
		waitUntil(by).clear();
	}
}
