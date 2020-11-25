package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T_01forumhomepageValidation {
public static WebDriver driver;
	@BeforeMethod
	public static void openbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Digitalpoint-Software\\FORUM_AUTOMATION\\Nov22\\Digitalpoint\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public static void validateforumpage()
	{
		
		driver.get("https://forum.digitalpoint.tech/");
	}

@AfterMethod
public static void closebrowser()
{
	
 driver.close();
}
}
