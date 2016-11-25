package practisingoneTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNGAnotations {
	System.setProperty("webdriver.gecko.driver","E:\\Testing\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
     //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
     //Launch website
     driver.navigate().to("http://test-popapp.rhcloud.com/#/login");
	
	
	}
   

