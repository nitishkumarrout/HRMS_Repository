package OrangeHrmsLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TitleCheck {
	public static void main(String[] args) throws Exception {
		String str;
		System.setProperty("webdriver.chrome.driver","E:\\TESTING COURSE\\new chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(2000);
		str=driver.getTitle();
		System.out.println("Alert ==>"+ str);
		if(str.equals("OrangeHRM - New Level Management")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
		}
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println("Logout completed");
		driver.close();
	}
}
