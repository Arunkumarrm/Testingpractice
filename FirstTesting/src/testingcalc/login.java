package testingcalc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E:\\Testing\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://test-popapp.rhcloud.com/#/login");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      driver.findElement(By.id("email")).sendKeys("gopi.kasu@gmail.com");
	      driver.findElement(By.id("password")).sendKeys("password");
	      driver.findElement(By.xpath("html/body/div[4]/div/form/div[3]/div/input")).click();

	}

}
