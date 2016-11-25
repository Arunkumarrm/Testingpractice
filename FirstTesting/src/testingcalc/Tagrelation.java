package testingcalc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tagrelation {
	

	public static void tagrelation(){
		  System.setProperty("webdriver.gecko.driver","E:\\Testing\\geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.navigate().to("http://test-popapp.rhcloud.com/#/tagrelation");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.xpath(".//*[@id='menu-navbar-collapse']/ul[3]/li/a")).click();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.xpath(".//*[@id='menu-navbar-collapse']/ul[3]/li/ul/li[2]/a")).click();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.id("email")).sendKeys("gopi.kasu@gmail.com");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.id("password")).sendKeys("password");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("html/body/div[4]/div/form/div[3]/div/input")).click();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("html/body/div[4]/div/div/div[1]/div[2]/form/div[1]/div/input")).sendKeys("selenium");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("html/body/div[4]/div/div/div[1]/div[2]/form/div[2]/div/input")).sendKeys("Webdriver");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("html/body/div[4]/div/div/div[1]/div[2]/form/div[3]/div/input")).sendKeys("3");
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("html/body/div[4]/div/div/div[1]/div[2]/form/div[4]/div/input")).click();
	}

	public static void main(String[] args) {
		Tagrelation.tagrelation();
	}

}
