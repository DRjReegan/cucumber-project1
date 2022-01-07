package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchasing_Page {
	public WebDriver driver;//null
	
	@FindBy(xpath = "(//*[contains(text(),'Evening Dresses')])[1]")
	private WebElement evenind_dress;
	
	public Purchasing_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);	
	}
public WebElement getEvening_Dress() {
	return evenind_dress;
}	
	

}
