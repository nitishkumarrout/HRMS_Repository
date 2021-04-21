package OrangeHrmsLogin; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropDown_TC {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING COURSE\\new chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		System.out.println("login completed");
		//frame
		driver.switchTo().frame("rightMenu");
		//select a value from dropdown
		Select st =new Select(driver.findElement(By.name("loc_code")));
		System.out.println("dropdown");
		Thread.sleep(3000);
		//st.selectByVisibleText("Emp.ID");
		driver.findElement(By.id("loc_name")).sendKeys("0038");
		//exit from frame
		driver.switchTo().defaultContent();
		System.out.println("logout");
		driver.close();
		
	}

}
