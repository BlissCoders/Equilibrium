package aequilibriumAssessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataProvider.ConfigFileReader;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory extends TestBase{
    public static WebDriver createWebDriver() {
        String webdriver = System.getProperty("browser", "chrome");
        ConfigFileReader configFileReader= new ConfigFileReader();
        switch(webdriver.toLowerCase()) {
            case "firefox":
            	System.setProperty("webdriver.gecko.driver", configFileReader.getDriverPath(webdriver));
      		    driver = new FirefoxDriver();
                return driver;
            case "chrome":
            	System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath(webdriver));
      		    driver = new ChromeDriver();
                return driver;
            default:
                throw new RuntimeException("Unsupported webdriver: " + webdriver);
        }
    }
}