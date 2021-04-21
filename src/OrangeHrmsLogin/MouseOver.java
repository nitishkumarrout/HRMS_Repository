package OrangeHrmsLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING COURSE\\new chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//mouse over opeartion
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'PIM')]"))).perform();
		System.out.println("Mouseover completed");
		
		
		
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("clicked on add button");
		//enter to frame
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("MOhanty");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Manoj");
		driver.findElement(By.name("txtEmpMiddleName")).sendKeys("Kumar");
		driver.findElement(By.name("txtEmpNickName")).sendKeys("HALA");
		driver.findElement(By.id("btnEdit")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.close();
		}

}
