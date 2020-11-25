package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {
public static WebDriver driver;
	
	public static WebDriver browsersetup()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Digitalpoint-Software\\FORUM_AUTOMATION\\Nov22\\Digitalpoint\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}

}
