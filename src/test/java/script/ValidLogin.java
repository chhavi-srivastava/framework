package script;

import org.testng.Assert;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.DashboardPage;
import page.LoginPage;

public class ValidLogin extends BaseTest {
	
	@Test(priority = 1)//According to manual test case we can decide which test should run first and then decide the priority.
	public void testValidLogin()
	{
		String un = Excel.getData("./data/input.xlsx","ValidLogin", 1, 0);
		String pw = Excel.getData("./data/input.xlsx","ValidLogin", 1, 1);
//		1. enter valid un
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName(un);
//		2. enter valid pw
		loginPage.setPassword(pw);
//		3. click on login button
		loginPage.clickLoginButton();
//		4. home page should be displayed
		DashboardPage dashboardPage=new DashboardPage(driver);
		boolean result = dashboardPage.verifyDashBoardPageIsDisplayed(wait);
		Assert.assertTrue(result);
	}

}
