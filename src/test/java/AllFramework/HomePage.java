package AllFramework;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Resources.BaseClass;

public class HomePage extends BaseClass {
	
	@Test(dataProvider ="getData")
	public void BasePageNavigation(String UserName,String PassWord,String text) throws IOException
	{
		driver=InitializeDriver();
		driver.get("http://qaclickacademy.com");
		LandingPage land = new LandingPage(driver);
		land.Window().click();
		land.getlogin().click();
		LoginPage Login = new LoginPage(driver);
		Login.getemail().sendKeys(UserName);
		Login.getPassword().sendKeys(PassWord);	
		System.out.println(text);
		Login.LoginBtn().click();
	}

	@DataProvider
	public Object[][] getData() {
		//Rows stands for how many different data types test should run
		//column stands for how many values per each test
		Object[][] data = new Object[2][3];
		data[0][0]= "nonrestricteduser@qw.com";
		data[0][1]= "12345";
		data[0][2]="Restricted USer";
		data[1][0]="restriceteduser@qw.com";
		data[1][1]="123658";
		data[1][2]= "nonrestriccted user";
		return data;
	}
	
}
