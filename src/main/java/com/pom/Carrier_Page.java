package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Carrier_Page {
	public WebDriver driver;
	
	@FindBy(name = "processCarrier")
	private WebElement carrier_Btn;
	
	public Carrier_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCarrier_Btn() {
		return carrier_Btn;
	}

}
