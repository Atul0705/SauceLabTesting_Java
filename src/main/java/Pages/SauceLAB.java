package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceLAB {
	WebDriver driver;
	public SauceLAB(WebDriver driver)
	{
		this.driver = driver;
	}
	public void login(String username,String password)
	{
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
	}
	
	public void addToCart()
	{
		List<WebElement>buttons = driver.findElements(By.xpath("//*[@class='btn btn_primary btn_small btn_inventory ']"));
		for(WebElement ele:buttons)
		{
			ele.click();
		}
	}
	public void clickOnCartButton() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("//*[@data-test='shopping-cart-badge']"));
		cart.click();
	}
	public void checkOut() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("xyz");
		driver.findElement(By.id("last-name")).sendKeys("abz");
		driver.findElement(By.id("postal-code")).sendKeys("119800");
		driver.findElement(By.id("continue")).click();
		System.out.println(driver.findElement(By.className("summary_info")).getText());
		driver.findElement(By.id("finish")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("h2")).getText());
	}
	

}
