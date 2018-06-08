package pages.mt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.Base;

public class Registrationpage extends Base{
	
	public static WebElement fname(WebDriver driver)
	{
		return driver.findElement(getelement("firstname"));
	}
	
	public static WebElement lname(WebDriver driver)
	{
		return driver.findElement(getelement("lastname"));
	}
	
	public static WebElement phone(WebDriver driver)
	{
		return driver.findElement(getelement("phone"));
	}
	
	public static WebElement email(WebDriver driver)
	{
		return driver.findElement(getelement("email"));
	}
	
	public static WebElement address(WebDriver driver)
	{
		return driver.findElement(getelement("address"));
	}
	
	public static WebElement city(WebDriver driver)
	{
		return driver.findElement(getelement("city"));
	}
	
	public static WebElement state(WebDriver driver)
	{
		return driver.findElement(getelement("state"));
	}
	
	public static WebElement postalcode(WebDriver driver)
	{
		return driver.findElement(getelement("zipcode"));
	}
	
	public static WebElement uname(WebDriver driver)
	{
		return driver.findElement(getelement("username"));
	}
	
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(getelement("password"));
	}
	
	public static WebElement cpassword(WebDriver driver)
	{
		return driver.findElement(getelement("confirmpassword"));
	}
	
	public static WebElement submitbtn(WebDriver driver)
	{
		return driver.findElement(getelement("submitbtn"));
	}
}
