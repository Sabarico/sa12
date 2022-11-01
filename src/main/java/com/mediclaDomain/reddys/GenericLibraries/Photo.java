package com.mediclaDomain.reddys.GenericLibraries;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo {
	public String screenshot(WebDriver driver,String name) throws IOException {
		Date d=new Date();
	String date = d.toString().replaceAll(":","-");
	TakesScreenshot ts=(TakesScreenshot) driver;
	ts.getScreenshotAs(OutputType.FILE);
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(AutoConstant.photoPath+date+name+".png");
	FileUtils.copyFile(src, dest);
	return date;
	}
}
