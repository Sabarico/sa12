package com.mediclaDomain.reddys.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	/**
	 * it is used to store all the login elements
	 */
	@FindBy(xpath="//a[text()=' GEARS ']")
private WebElement gearsbtn;
@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
private WebElement skillrarydemoapp;
@FindBy(xpath="//button[text()='Accept']")
private WebElement acceptbtn;
@FindBy(xpath="//a[text()=' Contact Us ']")
private WebElement contactusbtn;
@FindBy(name="q")
private WebElement searchtb;
@FindBy(xpath="//input[@value='go']")
private WebElement gobtn;
public WebElement getSearchtb() {
	return searchtb;
}
public WebElement getGobtn() {
	return gobtn;
}
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public SkillraryDemoLoginPage demoApp(WebDriver driver) {
	gearsbtn.click();
	skillrarydemoapp.click();
	return new SkillraryDemoLoginPage(driver);
}
public WebElement getGearsbtn() {
	return gearsbtn;
}
public WebElement getSkillrarydemoapp() {
	return skillrarydemoapp;
}
public ContactUsPage contactus(WebDriver driver) {
	contactusbtn.click();
	return new ContactUsPage(driver);
	}
public void Acceptbtn() {
	acceptbtn.click();
}
public WebElement getContactusbtn() {
	return contactusbtn;
	}
public CoreJavaPage searchcourse(WebDriver driver,String courseName) {
	searchtb.sendKeys(courseName);
	gobtn.click();
	return new CoreJavaPage(driver);
}
}
