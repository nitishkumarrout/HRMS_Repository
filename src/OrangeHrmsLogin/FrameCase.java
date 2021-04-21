package OrangeHrmsLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FrameCase {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING COURSE\\new chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		 driver.findElement(By.name("txtUserName")).sendKeys("admin");
		 driver.findElement(By.name("txtPassword")).sendKeys("admin");
		 Thread.sleep(3000);
		 driver.findElement(By.name("Submit")).click();
		 System.out.println("Login successfully");
		//switch to frame 
		 driver.switchTo().frame("rightMenu");
		 
		 
		//clicked Add button
		 driver.findElement(By.xpath("//input[@value='Add'] [@type='button']")).click();
		 
		 //enter the deatils
		 driver.findElement(By.name("txtEmpLastName")).sendKeys("Rout");
		 driver.findElement(By.name("txtEmpFirstName")).sendKeys("Bapi ");
		 driver.findElement(By.name("txtEmpMiddleName")).sendKeys("Kumar");
		 driver.findElement(By.name("txtEmpNickName")).sendKeys("Nigam");
		 
		 //press save button
		 driver.findElement(By.id("btnEdit")).click();
		//exit from frame
		 driver.switchTo().defaultContent();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.linkText("Logout")).click();
		 System.out.println("Logout completed");
		 driver.close();
		 
		 
	}

}
