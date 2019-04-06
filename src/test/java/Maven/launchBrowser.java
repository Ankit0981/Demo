package Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class launchBrowser {
	WebDriver driver;
	@BeforeTest
	public void method()
	{
	String driverPath= System.getProperty("user.dir")+"\\src\\test\\java\\BrowserD\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	}
	
	@Test
	public void Method1()
	{
		driver.get("https://www.google.com");
	}
	
}
