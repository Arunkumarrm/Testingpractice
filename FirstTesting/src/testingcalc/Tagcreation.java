package testingcalc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tagcreation {
	
	public static void tagcreation(){
		  System.setProperty("webdriver.gecko.driver","E:\\Testing\\geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      
	      driver.navigate().to("http://test-popapp.rhcloud.com/#/tagcreate");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath(".//*[@id='menu-navbar-collapse']/ul[3]/li/a/span")).click();
	      driver.findElement(By.xpath(".//*[@id='menu-navbar-collapse']/ul[3]/li/ul/li[1]/a")).click();
          driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.id("email")).sendKeys("gopi.kasu@gmail.com");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.id("password")).sendKeys("password");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("html/body/div[4]/div/form/div[3]/div/input")).click();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("html/body/div[4]/div/div/div[1]/div[2]/form/div[1]/div/input")).sendKeys("Selenium");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.id("iTagDesc")).sendKeys("WebDriver");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("html/body/div[4]/div/div/div[1]/div[2]/form/div[3]/div/input")).click();
		
	}

	public static void main(String[] args) {
		
	                Tagcreation.tagcreation();

	}

}
