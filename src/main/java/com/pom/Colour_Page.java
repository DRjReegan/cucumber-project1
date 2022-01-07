package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Colour_Page {
	public WebDriver driver;//null
	
	@FindBy(xpath = "(//a[@class='color_pick'])[2]")
	private WebElement colour_btn;
	
	public Colour_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
public WebElement getColour_Btn(){
	return colour_btn;
}
}
