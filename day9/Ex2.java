package test.day9;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Ex2 {
	WebDriver driver;
  @Test(groups="SmokeTest")
  public void Test1() {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
	  
  }
  
  
  @Test(groups="Regression Testcase")	
  public void Test2() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  
  }
  
  @Test(groups="Regression Testcase")
  public void Test3() throws InterruptedException {
	  

	  WebDriverManager.chromedriver().setup();
	  driver=new FirefoxDriver();
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  
	  
	  
  }
  @BeforeMethod
  public void beforeClass() {
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  
  }

  @AfterMethod
  public void afterClass() {
	  driver.close();
  }

}
