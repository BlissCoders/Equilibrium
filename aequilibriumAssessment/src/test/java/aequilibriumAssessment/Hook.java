package aequilibriumAssessment;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import dataProvider.ConfigFileReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;




public class Hook extends TestBase{	  
	  	
	  @Before 
	  public void setUp(Scenario current_scenario) throws InterruptedException {
		  
		  System.out.println("===>Setup driver and load browser");
		  WebDriverFactory.createWebDriver();
		  ConfigFileReader configFileReader= new ConfigFileReader();
		  	  
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
	      	      
	      System.out.println("=====>Default Site:" + configFileReader.getApplicationUrl());
		  driver.get(configFileReader.getApplicationUrl());
	  	  
	  }
	 
	  @After
	  public void tearDown(Scenario scenario) {
		  
		  if (scenario.isFailed()) {
				
			  byte[] data =((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			  scenario.attach(data, "image/png", "My screenshot");				  
			    
		    }
		  
		  System.out.println("===>Tear down...");
		  driver.close();
		
	  }
	  
	  
	 

}
