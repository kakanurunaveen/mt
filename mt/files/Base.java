package testbase;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;

public class Base {
	
	public static String data(String key)
	{
			String str=null;
			try {
				File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\config.properties");
				FileReader fr = new FileReader(f);
				
				Properties p = new Properties();
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
			By loc=null;
			try {
				File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\or.properties");
				FileReader fr = new FileReader(f);
				
				Properties p = new Properties();
				p.load(fr);
				
				
				String elevalue = p.getProperty(key);
				String locid = elevalue.split(":")[0];
				String locele = elevalue.split(":")[1];
				
				switch (locid)
				{
				case "id" : loc = By.id(locele);
							break;
				case "name" : loc = By.name(locele);
							  break;
				case "xpath" : loc = By.xpath(locele);
							   break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return loc;
	}

}
