package pages.mt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Generic {
	
	public static Select dropdownhandle(WebDriver driver, By p)
	{
		Select s = new Select(driver.findElement(p));
		return s;
	}

}
