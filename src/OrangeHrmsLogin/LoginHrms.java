package OrangeHrmsLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LoginHrms {
	public static void main(String[] args) throws Exception{
		System.out.println("Login into HRMS");
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING COURSE\\new chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		//driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("admin");
		
		
		Thread.sleep(1000);
		//driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("admin");
		Thread.sleep(1000);
		//driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println("All ops by xpath");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		System.out.println("Logout completed");
		//driver.close();
		driver.quit();
	}

}
