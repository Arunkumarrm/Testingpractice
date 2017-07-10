package testingcalc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lmsslogin {

	public static void logging(){
		  System.setProperty("webdriver.gecko.driver","E:\\Testing\\geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      //Launch website
	      driver.navigate().to("http://lms.qspl.co.in/login.aspx");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtusername")).sendKeys("admin");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPassword")).sendKeys("pass@1234");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPassword")).click();
	       
	     
	}
	
	
	public static void main(String[] args) {
		Lmsslogin.logging();

	}

}
