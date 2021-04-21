package Orange_HRMS_TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_TestNg {
	@Test(priority=2)
	public void Login() {
		System.out.println("login");
		
	}
	@Test(priority=1)
	public void Logout() {
		System.out.println("Logout");
	}
	@AfterClass
	public void AddEmp() {
		System.out.println("Add Emp");
	}
	@BeforeClass
	public void DeleteEmp() {
		System.out.println("del emp");
	}
}
