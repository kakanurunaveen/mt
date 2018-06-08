package pages.srss;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class Generic {

	public static Select dropdownhandle(WebDriver driver, By p)
	{
		Select s = new Select(driver.findElement(p));
		return s;
	}
	
	public static void screenShot(WebDriver driver, String screenshotname)
	{
		TakesScreenshot screen = (TakesScreenshot)driver;
		
		File src = screen.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File(".\\screen\\"+screenshotname+".png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
