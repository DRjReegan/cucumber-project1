package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Automation_Practice.runner.Runner_Class;
import com.Base_Class.BaseClass_Methods;
import com.Data_PropertiesFiles.File_Reader_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_Object_Manager.Page_Object_Manager;

public class Step_Def extends BaseClass_Methods {
	public static WebDriver driver = Runner_Class.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	@Given("^user Creates A Session$")
	public void user_Creates_A_Session() throws Throwable {
	    String url = File_Reader_Manager.getInstanceCR().getUrl();
	    url(url);
	    Thread.sleep(2000);
	}

	@Then("^user Clicks The SigninButton$")
	public void user_Clicks_The_SigninButton() throws InterruptedException{
	    clickonElement(pom.getinHP().getSign_Btn());
	    Thread.sleep(3000);
	}

	@When("^user Enters The Email In Email Field$")
	public void user_Enters_The_Email_In_Email_Field() throws IOException {
		String email = ParticularData("C:\\Users\\REEGAN\\eclipse-workspace\\Cucumber_Setup\\src\\main\\java\\Test Cases for Mini Project.xlsx", 2, 5);
	    InputValueElement(pom.getinLP().getEmail(), email);
	}

	@When("^user Enters The Paswword In Password Field$")
	public void user_Enters_The_Paswword_In_Password_Field() throws IOException {
	    String password = ParticularData("C:\\Users\\REEGAN\\eclipse-workspace\\Cucumber_Setup\\src\\main\\java\\Test Cases for Mini Project.xlsx", 3, 5);
	    InputValueElement(pom.getinLP().getPassword(), password);
	}

	@Then("^user Clicks On The Signin Button And It Navigates To The Home Page$")
	public void user_Clicks_On_The_Signin_Button_And_It_Navigates_To_The_Home_Page() throws InterruptedException {
	    clickonElement(pom.getinLP().getSubmit_Btn());
	    Thread.sleep(2500);
	}

	@When("^user Selects The Evening Dresses From Women Section$")
	public void user_Selects_The_Evening_Dresses_From_Women_Section() throws InterruptedException {
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//a[@title='Women']"));
		a.moveToElement(move).perform();
		Thread.sleep(1000);
		clickonElement(pom.getPP().getEvening_Dress());
	   Thread.sleep(2000);
	}

	@When("^user Clicks The Pink Colour Icon Button$")
	public void user_Clicks_The_Pink_Colour_Icon_Button() throws InterruptedException {
	   clickonElement(pom.getCP().getColour_Btn());
	   Thread.sleep(2000);
	   
	}

	@When("^user Clicks The Add To Cart Button$")
	public void user_Clicks_The_Add_To_Cart_Button() throws InterruptedException {
	    clickonElement(pom.getAC().getAddtoCart_Btn());
	    Thread.sleep(2000);
	}
	@When("^user Clicks The Proceed To Checkout Button$")
	public void user_Clicks_The_Proceed_To_Checkout_Button() throws InterruptedException{
	    clickonElement(pom.getCP1().getCheckout_Btn());
	    Thread.sleep(2000);
	}
	@When("^user Increases The Quantity (\\d+)Times$")
	public void user_Increases_The_Quantity_Times(int arg1) throws InterruptedException {
		for (int i = 0; i < 3; i++) {
			clickonElement(pom.getQP().getQuantity_Btn());
		}
	    Thread.sleep(2000);
	}


	@When("^user Clicks The Proceed To Checkout Button To Confirm$")
	public void user_Clicks_The_Proceed_To_Checkout_Button_To_Confirm() throws InterruptedException{
	    clickonElement(pom.getCK().getcheckOut_Btn2());
	    Thread.sleep(2000);
	}
	@When("^user Clicks The Proceed To Checkout Buttons$")
	public void user_Clicks_The_Proceed_To_Checkout_Buttons() throws InterruptedException{
	    clickonElement(pom.getSP().getSubmit_btn());
	    Thread.sleep(2000);
	}

	@When("^user Clicks The Radio Button$")
	public void user_Clicks_The_Radio_Button() throws Throwable {
	   clickonElement(pom.getCP3().getCheckout_Btn3());
	   Thread.sleep(2000);
	}
	@Then("^user Clicks The Proceed To Checkout Button Again$")
	public void user_Clicks_The_Proceed_To_Checkout_Button_Again() throws InterruptedException {
	    clickonElement(pom.getCAP().getCarrier_Btn());
	    Thread.sleep(2000);
	}

	@When("^User Clicks The Pay By BankWire Button$")
	public void user_Clicks_The_Pay_By_BankWire_Button() throws InterruptedException {
	    clickonElement(pom.getPay().getPayment_Btn());
	    Thread.sleep(2000);
	}

	@Then("^User Clicks The I Confirm The Order Button$")
	public void user_Clicks_The_I_Confirm_The_Order_Button() {
	   clickonElement(pom.getFS().getFinalSubmit_Btn());
	}
}
