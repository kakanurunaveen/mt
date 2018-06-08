package pages.mt;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import exceldata.Data;

public class NewTest extends Repository{
  @Test(priority=0)
  void verify_registerbtn() {
	  registration();
  }
  
  @Test(priority=1)
  void verify_rpage() {
	 
	  Data.excel_in_con(data("excelfilename"), data("sheet"));
	  
	  Data.excel_out_con(data("excelfilename"), data("exceloutfile"), data("sheet"));
	  
	  register(Data.readdata(0, 1), Data.readdata(1, 1), Data.readdata(2, 1), Data.readdata(3, 1), Data.readdata(4, 1), Data.readdata(5, 1), Data.readdata(6, 1), Data.readdata(7, 1), Data.readdata(8, 1), Data.readdata(9, 1), Data.readdata(10, 1), Data.readdata(11, 1));
	  
	  String msge = driver.findElement(getelement("thankyou")).getText();
	  
	  if(msge.contains(data("msg")))
	  {
		  Data.writedata(12, 1, msge);
	  }
	  else
	  {
		  Data.writedata(12, 1, "Not Created");
	  }
	  Data.saveworkbook();
  }
  
  @BeforeTest
  void verify_launch() {
	  launch();
  }
  
  @AfterTest
  void verify_close() {
	  close();
  }
}
