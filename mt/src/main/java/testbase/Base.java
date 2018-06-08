package testbase;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;

public class Base {

	public static String data(String key)
	{
		String str = null;
		try {
			File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\config.properties");
			
			FileReader fr = new FileReader(f);
			
			Properties p =new Properties();
			
			p.load(fr);
			
			str = p.getProperty(key);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
	
	public static By getelement(String key)
	{
		By loc = null;
		try {
			File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\or.properties");
			
			FileReader fr = new FileReader(f);
			
			Properties p =new Properties();
			
			p.load(fr);
			
			String elevalue = p.getProperty(key);
			String eleid = elevalue.split(":")[0];
			String element = elevalue.split(":")[1];
			
			switch(eleid)
			{
			case "id" : loc = By.id(element);
						break;
			case "name" : loc = By.name(element);
						  break;
			case "linkText" : loc = By.linkText(element);
							  break;
			case "tagName" : loc = By.tagName(element);
							 break;
			case "xpath" : loc = By.xpath(element);
						   break;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return loc;
	}
	
}
