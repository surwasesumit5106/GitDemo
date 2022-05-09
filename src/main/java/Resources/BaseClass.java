package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class BaseClass {
	


	public WebDriver driver;
	
	public WebDriver InitializeDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\91976\\Selenium Tests\\E2EProject\\src\\main\\java\\Resources\\data.properties");

		prop.load(file);
		String browserName =prop.getProperty("browser");
		
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91976\\Desktop\\Browser driveres\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			
			
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91976\\Desktop\\Browser driveres\\chromedriver_win32\\chromedriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
	}
	



}
