package OrangeHrmsLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class DropDown {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING COURSE\\new chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(2000);
		
		WebElement   day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year =driver.findElement(By.id("year"));
		
//		Select sel1=new Select(day);
//		sel1.selectByVisibleText("29");
//		Thread.sleep(3000);
//		
//		Select sel2=new Select(month);
//		sel2.selectByVisibleText("May");
//		Thread.sleep(3000);
//		
//		Select sel3=new Select(year);
//		sel3.selectByVisibleText("1995");
//		Thread.sleep(3000);
		String dob= "10-May-1995";
		String arr[]=dob.split("-");
		
		DropDown_Tc(day,arr[0]);
		DropDown_Tc(month,arr[1]);
		DropDown_Tc(year,arr[2]);
		Thread.sleep(3000);
		driver.quit();
		
	}
	public static void DropDown_Tc(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByVisibleText(value);
	}

}
