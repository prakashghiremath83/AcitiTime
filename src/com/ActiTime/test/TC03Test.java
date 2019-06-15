package com.ActiTime.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ActiTime.Generic.BaseTest;
import com.ActiTime.Generic.ExcelData;
import com.ActiTime.page.actiTIMELoginPage;

public class TC03Test extends BaseTest
{
	@Test(priority=3)
	public void Verifyversion()
	{
		String title = ExcelData.getData(file_path, "TC01", 1, 2);
		String eversion = ExcelData.getData(file_path, "TC03", 1, 0);
		actiTIMELoginPage lg = new actiTIMELoginPage(driver);
		lg.verifyTitle(title);
		String aversion = lg.verifyVersion();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(aversion, eversion);
		sa.assertAll();
		
	}

}
