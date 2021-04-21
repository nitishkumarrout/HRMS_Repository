package OrangeHrmsLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class YahooTeestCase {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING COURSE\\new chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://in.yahoo.com/");
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("phynitish");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		System.out.println("username entered");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/input[@id='login-passwd']")).sendKeys("Reyansh@07");
		driver.findElement(By.id("login-passwd")).sendKeys("Reyansh@07");
		System.out.println("password entered");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("loged in");
		//mouse over
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//header/div[@id='applet_p_50000372']/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]/div[1]"))).perform();
		System.out.println("mouse overed");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign out')]")).click();
		System.out.println("loged out");
		//driver.close();
		driver.quit();
	}
}
