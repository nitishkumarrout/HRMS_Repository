package OrangeHrmsLogin;
import java.io.File;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_ScreenShot {
	WebDriver driver;
	@BeforeClass
	public void Scrnshot() {
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING COURSE\\new chrome driver\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	}
	@AfterClass
	public void TearDown() {
		driver.close();
		Reporter.log("Logout Completed");
	}
	@Test
	
	public void Login() throws Exception{
		try {
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		WebElement web=driver.findElement(By.linkText("PIM"));
		Actions action=new Actions(driver);
		action.moveToElement(web).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Add Employee1')]")).click();
		System.out.println("clicked on submenu");
		Thread.sleep(2000);
			
	}
	catch(Exception e) {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(file, new File("E:\\Selenium Practice\\OrangeHrmLogin\\src\\OrangeHrmsLogin\\ScreenShot\\error.png"));
		System.out.println("took screenshot");
	}
	}

}
