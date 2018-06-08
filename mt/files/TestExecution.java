package pages.srss;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import excel.Data;

public class TestExecution extends Repository{

	@BeforeTest
	void verify_launch()
	{
		launch();
	}
	
	@Test(priority=0)
	void verify_login()
	{
		login();
		String str = driver.getTitle();
		if(str.contains("KEXIM BANK"))
		{
			Generic.screenShot(driver, data("screenshot"));
		}
	}
	
	@Test(priority=1)
	void verfity_homepage()
	{
		hpage();
	}
	
	/*@Test(priority=2)
	void verify_newbranch()
	{
		newbranch();
	}*/
	
	@Test(priority=2)
	void branchcreation()
	{
		Data.excel_con(data("excelinputfile"), data("excelsheet"));
		
		Data.outputexcelcon(data("excelinputfile"),data("exceloutfile1"), data("excelsheet"));
		
		for(int r=1;r<Data.rcount();r++)
		{
			newbranch();
			branchcreation(Data.readdata(0,r), Data.readdata(1,r), Data.readdata(2,r), Data.readdata(3,r), Data.readdata(4,r), Data.readdata(5,r));
			
			String str = driver.switchTo().alert().getText();
			
			driver.switchTo().alert().accept();
			
			if(str.contains("created Sucessfully"))
			{
				Data.writedata(6, r, str);
			}
			else if(str.contains("already Exist"))
			{
				Data.writedata(6, r, str);
			}
			else
			{
				Data.writedata(6, r, str);
			}
		}
		Data.saveworkbook();
	}
	
	@AfterTest
	void verify_close()
	{
		close();
	}
}
