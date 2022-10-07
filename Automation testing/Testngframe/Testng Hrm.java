    package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginHrm {
	private static WebDriver driver = null;
	
  @Test
  public void login() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Shivaram\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
  }
  
  @Test
  public void Leave() {
	 driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.xpath("//nav/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();

		driver.findElement(By.xpath("//input[@placeholder='yyyy-M-dd']")).sendKeys("2022-09-22");
		//driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	//	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]")).sendKeys("2022-09-24");
		driver.findElement(By.xpath("//button[@type='submit']")).click();	

  }
}

    
