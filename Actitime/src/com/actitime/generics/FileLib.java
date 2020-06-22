package com.actitime.generics;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Sandeep Naidu
 *
 */
public class FileLib 
{

	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getpropertyvalue(String key) throws IOException
	{

		FileInputStream fis=new FileInputStream("D:\\workspace\\Actitime\\data\\CommonData.property");
		Properties p =new Properties();
		p.load(fis);
		String  value = p.getProperty(key);
		return value;
	}
	/**
	 * 
	 * @param sheetname
	 * @param row
	 * @param colnum
	 * @return
	 * @throws IOException
	 */
	public String getExcelSheet(String sheetname,int row,int colnum) throws IOException
	{
		FileInputStream fis= new FileInputStream("D:\\workspace\\Actitime\\data\\TestScript.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetname).getRow(row).getCell(colnum).toString();	
		return value;
	}


}