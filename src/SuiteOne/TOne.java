package SuiteOne;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



public class TOne {
	
	WebDriver driver;
	//@BeforeSuite
	@BeforeMethod
	public void SetUp()
	{
		System.out.println(" Set up Browser property");
		System.out.println(" Enter URL before test");
		System.setProperty("webdriver.chrome.driver", "C:\\temp\\Download\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// launch web site
		driver.get("https://uksdcweb900/");
		
		
	}
	
	@BeforeTest
	public void LaunchBrowser()
	{
		System.out.println(" Launch Browser ");
	}
	
	/*@BeforeClass
	public void LoginApp()
	{
		System.out.println(" Login app ");
	}*/
	
	/*public void EnterURL()
	{
		
	}*/
	@Test(priority=2,groups = {"hello"})
	public void Test1()
	{
		System.out.println(" test 1 get title");
		String title = driver.getTitle();
		System.out.println(title);
		//System.out.println("");
	}
	@Test(priority=1,groups = {"hello"})
	public void Test2()
	{
		System.out.println(" test 2 validate page");
		//System.out.println("");
	}
	@AfterMethod
	public void ClosePage()
	{
		System.out.println(" Close Page after test");
		driver.quit();
	}
	@AfterClass
	public void LogOut()
	{
		System.out.println(" LogOUT");
	}
	@AfterTest
	public void ClearCookies()
	{
		System.out.println(" Clear cookies");
	}
	@AfterSuite
	public void CloseBrowser()
	{
		System.out.println(" tear down suite- Close Browser");
	}
	
	
	
}
