package OrangeHrmsLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class KeyBoard_Web_Tc {

	public static void main(String[] args) throws  Exception{
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING COURSE\\new chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		System.out.println("keyboard ops done");
		//driver.close();
		driver.quit();
		
	}

}
