package com.mediclaDomain.reddys.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	@FindBy(name="name")
	private WebElement nametb;
	@FindBy(name="sender")
	private WebElement emailtb;
	@FindBy(name="subject")
	private WebElement subjecttb;
	@FindBy(name="message")
	private WebElement messagetb;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement sendusbtn;
	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void sendDetails(String name,String mail,String subject,String sender,String message) {
	nametb.sendKeys(name);
	emailtb.sendKeys(mail);
	subjecttb.sendKeys(subject);
	messagetb.sendKeys(message);
	sendusbtn.click();
	}
}
