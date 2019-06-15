package com.ActiTime.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ActiTime.Generic.BaseTest;
import com.ActiTime.Generic.ExcelData;
import com.ActiTime.page.actiTIMELoginPage;

public class TC02Test extends BaseTest
{
	@Test(priority=2)
	public void InvalidLogin() throws InterruptedException
	{
		String title = ExcelData.getData(file_path, "TC01", 1, 2);
		String eError = ExcelData.getData(file_path, "TC02", 1, 2);
		int rc = ExcelData.getRowCount(file_path, "TC02");
		actiTIMELoginPage lg = new actiTIMELoginPage(driver);
		lg.verifyTitle(title);
		for(int i=1; i<=rc; i++)
		{
			String un = ExcelData.getData(file_path, "TC02", i, 0);
			String pw = ExcelData.getData(file_path, "TC02", i, 1);
			Reporter.log("User name "+un,true);
			lg.enterUserName(un);
			Reporter.log("Password "+pw,true);
			lg.enterPassword(pw);
			lg.clickOnLOgion();
			String Aerror = lg.verifyErrorMSG();
			Assert.assertEquals(Aerror, eError);
			Reporter.log("===================================",true);
			Thread.sleep(2000);
		}
		
	}

}
