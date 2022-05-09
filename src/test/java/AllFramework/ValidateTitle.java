package AllFramework;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import Resources.BaseClass;


public class ValidateTitle extends BaseClass {

	@Test

	public void ValidateTitleOfLandingPage() throws IOException {

		driver = InitializeDriver();
		driver.get("https://qaclickacademy.com");
		LandingPage Land = new LandingPage(driver);
		Land.Window().click();
		Assert.assertEquals(Land.getTitle().getText(), "FEATURED COURSES");
		System.out.println("The extracted title of page is : "+ Land.getTitle().getText());
	}

	}
	
