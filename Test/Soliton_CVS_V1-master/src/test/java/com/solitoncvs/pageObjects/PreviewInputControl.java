package com.solitoncvs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreviewInputControl {
	WebDriver ldriver;
	
	public PreviewInputControl(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/div[@id='layoutroot']/div[@class='flexcol']/div[@class='stream-panel']/div[@class='inputs']/div[@class='flexcol']/div[@class='live-panel']/div[1]/div[1]")
	@CacheLookup
	WebElement previewinput;
	
	public void previewInputControl()
	{
		previewinput.click();
	}

}
