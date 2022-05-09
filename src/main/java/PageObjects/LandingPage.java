package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	
	public WebDriver driver;
	
	By login = By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector(".text-center");
	//By LandingPopupWIndow= By.xpath("//body/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[7]/div[1]/div[1]/div[2]");
	@FindBy(xpath="//body/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[7]/div[1]/div[1]/div[2]")
	WebElement LandingPopupWIndow;
	public LandingPage(WebDriver driver2) {
		this.driver=driver2;
		
		
	}



	public WebElement getlogin() {
		return driver.findElement(login);
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	
	public WebElement Window() {
		return driver.findElement((By) LandingPopupWIndow);
	}
	
}
