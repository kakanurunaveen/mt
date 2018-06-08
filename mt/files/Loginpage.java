package pages.srss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.Base;

public class Loginpage extends Base{
	
	public static WebElement username(WebDriver driver)
	{
		return driver.findElement(getelement("username"));
	}
	
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(getelement("password"));
	}
	
	public static WebElement loginbtn(WebDriver driver)
	{
		return driver.findElement(getelement("login_btn"));
	}

}
