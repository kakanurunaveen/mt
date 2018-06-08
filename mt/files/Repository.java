package pages.srss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import testbase.Base;

public class Repository extends Base{
	
	static WebDriver driver;
	public static void launch()
	{
		System.setProperty(data("chrome_driver"), data("chrome_path"));
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(data("baseurl"));
		
	}
	
	public static void login()
	{
		Loginpage.username(driver).sendKeys(data("username"));
		Loginpage.password(driver).sendKeys(data("password"));
		
		Loginpage.loginbtn(driver).click();
	}
	
	public static void hpage()
	{
		Homepage.branch(driver).click();
	}
	
	public static void newbranch()
	{
		BranchCreation.newBranch(driver).click();
	}
	
	public static void branchcreation(String bname,String address,String zipcode,String country,String state,String city)
	{
		NewBranch.branch(driver).sendKeys(bname);
		NewBranch.address(driver).sendKeys(address);
		NewBranch.zipcode(driver).sendKeys(zipcode);
		
		Generic.dropdownhandle(driver, getelement("country")).selectByVisibleText(country);
		Generic.dropdownhandle(driver, getelement("state")).selectByVisibleText(state);
		Generic.dropdownhandle(driver, getelement("city")).selectByVisibleText(city);
		
		NewBranch.submitbtn(driver).click();
		
		//driver.switchTo().alert().accept();
	}
	
	public static void close()
	{
		driver.close();
	}

}
