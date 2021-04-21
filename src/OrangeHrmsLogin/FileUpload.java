package OrangeHrmsLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class FileUpload {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING COURSE\\new chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		//entry to iframe
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		
		driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("Tripathy");
		driver.findElement(By.xpath("//input[@id='txtEmpFirstName']")).sendKeys("Pankaj ");
		driver.findElement(By.xpath("//input[@id='txtEmpMiddleName']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id='txtEmpNickName']")).sendKeys("Banku");
		Thread.sleep(3000);
		//file upload
		WebElement fileinput=driver.findElement(By.xpath("//input[@id='photofile']"));
		fileinput.sendKeys("E:\\TESTING COURSE\\pankaj tripathi.png");
		System.out.println("File upload successfully");
		driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
		//exit from frame
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		System.out.println("Logout completely");
		driver.quit();
		
	}

}
