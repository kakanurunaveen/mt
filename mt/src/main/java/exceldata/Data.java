package exceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import testbase.Base;

public class Data {
	
	public static String folderpath = Base.data("excelfolderpath");
	static Workbook wb;
	static Sheet sh;
	static WritableWorkbook wwb;
	static WritableSheet wsh;
	
	public static void excel_in_con(String filename, String sheetname)
	{
		try {
			File f =new File(folderpath+filename);
			
			wb = Workbook.getWorkbook(f);
			
			sh = wb.getSheet(sheetname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int rcount()
	{
		int i = sh.getRows();
		return i;
	}
	
	public static int ccount()
	{
		int i = sh.getColumns();
		return i;
	}
	
	public static String readdata(int col,int row)
	{
		String str = sh.getCell(col, row).getContents();
		return str;
	}
	
	public static void excel_out_con(String ifilename,String ofilename,String sheet)
	{
		try {
			FileInputStream fis = new FileInputStream(folderpath+ifilename);
			
			wb = Workbook.getWorkbook(fis);
			
			sh = wb.getSheet(sheet);
			
			FileOutputStream fos = new FileOutputStream(folderpath+ofilename);
			
			wwb = Workbook.createWorkbook(fos, wb);
			
			wsh = wwb.getSheet(sheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writedata(int col,int row,String data)
	{
		Label l =new Label(col,row,data);
		
		try {
			wsh.addCell(l);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void saveworkbook()
	{
		try {
			wwb.write();
			wwb.close();
			wb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
