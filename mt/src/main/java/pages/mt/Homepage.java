package pages.mt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.Base;

public class Homepage extends Base{
	
	public static WebElement register(WebDriver driver)
	{
		return driver.findElement(getelement("register"));
	}

}
