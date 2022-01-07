package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Page3 {
	public WebDriver driver;
	
	@FindBy(id = "uniform-cgv")
	private WebElement checkout_Btn3;
	
	public Checkout_Page3(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
public WebElement getCheckout_Btn3() {
	return checkout_Btn3;
}
}
