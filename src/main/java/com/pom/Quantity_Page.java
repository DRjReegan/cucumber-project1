package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quantity_Page {
	public WebDriver driver;
	
	@FindBy(id = "cart_quantity_up_4_43_0_616046")
	private WebElement cartQuanity_Btn;
	public Quantity_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
public WebElement getQuantity_Btn() {
	return cartQuanity_Btn;
}
}
