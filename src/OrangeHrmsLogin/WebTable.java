package OrangeHrmsLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;



public class WebTable {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\TESTING COURSE\\new chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///E:/TESTING%20COURSE/WebTable.html");
		Thread.sleep(3000);
		
		//count from table
		int row=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
		int col=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
		int row_col=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
		
		System.out.println("row = "+row);
		System.out.println("col = "+col);
		System.out.println("row_col = "+row_col);
		//retrive data from cell
		String cell_data=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[2]/td[2]")).getText();
		System.out.println("cell_data =  "+cell_data);
		    //retrive data from webtable
		for(int i=1;i<=row;i++) {
		String Tab_data=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]")).getText();
		System.out.println("tab_data ="+ Tab_data);
			}
		driver.close();
	}

}
