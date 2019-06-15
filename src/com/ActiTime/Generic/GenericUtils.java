package com.ActiTime.Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericUtils
{
	public static void getScreenShot(WebDriver driver,String name)
	{
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenShot/"+name+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) 
		{
			
		}
	}

}
