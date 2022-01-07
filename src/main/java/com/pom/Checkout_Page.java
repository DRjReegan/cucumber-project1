package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Page {
public WebDriver driver;

@FindBy(xpath = "//a[@title='Proceed to checkout']")
private WebElement checOut_Btn;

public Checkout_Page(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
} 
	public WebElement getCheckout_Btn() {
		return checOut_Btn;
	}
}
