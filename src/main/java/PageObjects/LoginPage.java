package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	
	By EmailId = By.xpath("//input[@id='user_email']");
	By Password = By.xpath("//input[@id='user_password']");
	By LoginBtn = By.cssSelector("input[class='btn btn-primary btn-md login-button']");
	
	
	public LoginPage(WebDriver driver2) {
		
		this.driver=driver2;
	}


	public WebElement getemail()
	{
		return driver.findElement(EmailId);
	}
	
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	
	public WebElement LoginBtn() {
		return driver.findElement(LoginBtn);
	}
	
	
	
}
