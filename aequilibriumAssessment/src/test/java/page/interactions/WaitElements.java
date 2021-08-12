package page.interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import aequilibriumAssessment.TestBase;

public class WaitElements extends TestBase{
	
	public static List<WebElement> findElements(By by){		
		return waitUntilElements(by);
	}
	

	public static WebElement findElement(By by){
		return waitUntil(by);		
	}
	
	
	public static WebElement waitUntil(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return element;
	}
	
	public static List<WebElement> waitUntilElements(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
		return elements;
	}

}
