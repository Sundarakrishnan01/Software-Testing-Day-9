package test.day9;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Ex4 {
	WebDriver driver;
  @Test
  public void login() {
	  WebElement w=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	  w.sendKeys("Admin");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).submit();
	  String dash=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	  Assert.assertEquals(dash, "Dashboard");
  }

  
  @Parameters("browsers")
  @BeforeMethod
  public void beforeMethod(String browser1) throws InterruptedException {
	  if(browser1.equals("chrome")) {
		  ChromeOptions co=new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  Thread.sleep(4000);
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
	  }
	  else if(browser1.equals("edge")) {
		  EdgeOptions co=new EdgeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();

		  Thread.sleep(4000);
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
	  }
	  else {
		  ChromeOptions co=new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  Thread.sleep(4000);
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
	  }

  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }


  
}
