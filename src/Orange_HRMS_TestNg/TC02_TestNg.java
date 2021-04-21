package Orange_HRMS_TestNg;

import java.io.FileInputStream;
import jxl.Sheet;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Workbook;

public class TC02_TestNg {
	WebDriver driver;
	@BeforeClass
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING COURSE\\new chrome driver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	@Test
	public void Test() throws Exception{
		//Excel
		FileInputStream file =new FileInputStream("E:\\TESTING COURSE\\ExcelExp.xls");
		Workbook wb=Workbook.getWorkbook(file);
		Sheet st=wb.getSheet("Sheet1"); 
		String var1=st.getCell(0, 1).getContents();
		String var2=st.getCell(1, 1).getContents();
		Reporter.log("var1 ="+ var1);
		Reporter.log("var2 ="+ var2);
		
				
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		Thread.sleep(3000);
		Reporter.log("Title ="+driver.getTitle());
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Reporter.log("Login completely");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout successfully");
		
		
	}

}
