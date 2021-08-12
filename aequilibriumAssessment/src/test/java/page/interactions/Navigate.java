package page.interactions;

import aequilibriumAssessment.TestBase;

public class Navigate extends TestBase {
	
	public static String getUrl() {
		return driver.getCurrentUrl();
	}

}
