package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseSauce {
	
	public WebDriver driver;
	public baseSauce(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void invokeBrowser(String url)
	{
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
	}
	
	public void closeSession()
	{
		driver.close();
	}
	 
	public void teardownSession()
	{
		driver.quit();
	}

}
