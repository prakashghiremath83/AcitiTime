package com.ActiTime.test;

import org.testng.annotations.Test;

import com.ActiTime.Generic.BaseTest;
import com.ActiTime.Generic.ExcelData;
import com.ActiTime.page.actiTIMEEnterTimeTrackPage;
import com.ActiTime.page.actiTIMELoginPage;

public class TC01Test extends BaseTest 
{
	@Test(priority=1)
	public void ValidLoginLogout()
	{
		String un = ExcelData.getData(file_path, "TC01", 1, 0);
		String pw = ExcelData.getData(file_path, "TC01", 1, 1);
		String lgTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String hpTitle = ExcelData.getData(file_path, "TC01", 1, 3);
		actiTIMELoginPage lg = new actiTIMELoginPage(driver);
		actiTIMEEnterTimeTrackPage hp = new actiTIMEEnterTimeTrackPage(driver);
		lg.verifyTitle(lgTitle);
		lg.enterUserName(un);
		lg.enterPassword(pw);
		lg.clickOnLOgion();
		lg.verifyTitle(hpTitle);
		hp.clickOnLogout();
		lg.verifyTitle(lgTitle);
	}

}

