package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finalsubmit_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement finalsubmit_Btn;
	
	public Finalsubmit_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFinalSubmit_Btn() {
		return finalsubmit_Btn;
	}
}
