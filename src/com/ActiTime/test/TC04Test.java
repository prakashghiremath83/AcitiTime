package com.ActiTime.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ActiTime.Generic.BaseTest;
import com.ActiTime.Generic.ExcelData;
import com.ActiTime.page.actiTIMEEnterTimeTrackPage;
import com.ActiTime.page.actiTIMELoginPage;

public class TC04Test extends BaseTest
{
	@Test(priority=4)
	public void Verifybuildnumber()
	{
		String un = ExcelData.getData(file_path, "TC01", 1, 0);
		String pw = ExcelData.getData(file_path, "TC01", 1, 1);
		String lgTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String hpTitle = ExcelData.getData(file_path, "TC01", 1, 3);
		String eversion = ExcelData.getData(file_path, "TC04", 1, 0);
		actiTIMELoginPage lg = new actiTIMELoginPage(driver);
		actiTIMEEnterTimeTrackPage hp = new actiTIMEEnterTimeTrackPage(driver);
		lg.verifyTitle(lgTitle);
		lg.enterUserName(un);
		lg.enterPassword(pw);
		lg.clickOnLOgion();
		lg.verifyTitle(hpTitle);
		hp.clickOnHelp();
		hp.clickOnAboutYourActiTIME();
		String aversion = hp.verifyBilledNo();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(aversion, eversion);
		sa.assertAll();
	}

}
