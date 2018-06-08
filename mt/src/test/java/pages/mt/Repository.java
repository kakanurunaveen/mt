package pages.mt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import testbase.Base;

public class Repository extends Base{
	
	static WebDriver driver;
	
	public static void launch()
	{
		System.setProperty(data("driver"), data("driverpath"));
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(data("baseurl"));
		
	}

	public static void registration()
	{
		Homepage.register(driver).click();
	}
	
	public static void register(String fname,String lname,String phone,String email,
		String address,String city,String state,String zipcode,String country,
		String uname,String pword,String cpword)
	{
		Registrationpage.fname(driver).sendKeys(fname);
		Registrationpage.lname(driver).sendKeys(lname);
		Registrationpage.phone(driver).sendKeys(phone);
		Registrationpage.email(driver).sendKeys(email);
		Registrationpage.address(driver).sendKeys(address);
		Registrationpage.city(driver).sendKeys(city);
		Registrationpage.state(driver).sendKeys(state);
		Registrationpage.postalcode(driver).sendKeys(zipcode);
		
		Generic.dropdownhandle(driver, getelement("country")).selectByVisibleText(country);
		
		Registrationpage.uname(driver).sendKeys(uname);
		Registrationpage.password(driver).sendKeys(pword);
		Registrationpage.cpassword(driver).sendKeys(cpword);
		
		Registrationpage.submitbtn(driver).click();
	}
	
	public static void close()
	{
		driver.close();
	}
}
