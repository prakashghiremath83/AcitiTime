package com.ActiTime.Generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	public static String getData(String file_path,String sheetName,int rn, int cn)
	{
		try
		{
			FileInputStream file = new FileInputStream(new File(file_path));
			Cell c = WorkbookFactory.create(file).getSheet(sheetName).getRow(rn).getCell(cn);
			String data = c.toString();
			return data;
		}
		catch (Exception e)
		{
			return null;
		}
	}
	
	public static int getRowCount(String file_path, String sheetName)
	{
		try
		{
			FileInputStream file = new FileInputStream(new File(file_path));
			int rc = WorkbookFactory.create(file).getSheet(sheetName).getLastRowNum();
			return rc;
		}
		catch (Exception e) 
		{
			return 0;
		}
	}
	public static int getCellCount(String file_path, String sheetName,int rn)
	{
		try
		{
			FileInputStream file = new FileInputStream(new File(file_path));
			int cc = WorkbookFactory.create(file).getSheet(sheetName).getRow(rn).getLastCellNum();
			return cc;
		}
		catch (Exception e) 
		{
			return 0;
		}
	}
}
