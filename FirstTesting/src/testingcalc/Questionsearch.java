package testingcalc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Questionsearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\Testing\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://test-popapp.rhcloud.com/#/qcreate");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath(".//*[@id='menu-navbar-collapse']/ul[2]/li/a/span")).click();
	      driver.findElement(By.xpath(".//*[@id='menu-navbar-collapse']/ul[2]/li/ul/li[1]/a")).click();
          driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.id("email")).sendKeys("gopi.kasu@gmail.com");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.id("password")).sendKeys("password");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("html/body/div[4]/div/form/div[3]/div/input")).click();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.id("uname")).sendKeys("What is selenium Webdriver?");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.id("iAnswer")).sendKeys("WebDriver is a tool for automating web application testing.");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("html/body/div[4]/div/div/div[1]/div[2]/form/div[3]/div/input")).sendKeys("Selenium Webdriver");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.id("dropdownMenu1")).click();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("html/body/div[4]/div/div/div[1]/div[2]/form/div[4]/div/ul/li[1]/a")).click();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("html/body/div[4]/div/div/div[1]/div[2]/form/div[5]/div/input")).click();
	            

	}

}
