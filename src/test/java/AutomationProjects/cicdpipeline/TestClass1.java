package AutomationProjects.cicdpipeline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	
	public static WebDriver driver ;
	
	@BeforeMethod
	public void launchDriver()
	{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.manage().window().fullscreen();
	}
	
	@Test
	public void Test1()
	{
		driver.navigate().to("https://automationtalks.com");
		System.out.println("Test 1 title is " + driver.getTitle());
	}

	@Test
	public void Test2()
	{
		driver.navigate().to("https://automationtalks.com");
		System.out.println("Test 2 title is " + driver.getTitle());		
	}

	@Test
	public void Test3()
	{
		driver.navigate().to("https://automationtalks.com");
		System.out.println("Test 3 title is " + driver.getTitle());
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
