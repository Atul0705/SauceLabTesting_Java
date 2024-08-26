package SuaceTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Base.baseSauce;
import Pages.SauceLAB;

public class SauceTest {
	
	public static void main(String [] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver();
	baseSauce base = new baseSauce(driver);
	String url = "https://www.saucedemo.com/";
	SauceLAB page = new SauceLAB(driver);
	String username = "performance_glitch_user";
	String password = "secret_sauce";
	
	
		base.invokeBrowser(url);
		page.login(username,password);
		page.addToCart();
		page.clickOnCartButton();
		page.checkOut();
		base.closeSession();
		
	
	}
}

