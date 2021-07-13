package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	// public WebDriver driver;
	@Given("User in Adactin login page")
	public void user_in_fb_login_page() {

		launchBrowser();
		launch("https://adactinhotelapp.com/index.php");

	}

	@When("user enter{string} and {string}")
	public void user_enter_and(String email, String pass) {
		WebElement uid = driver.findElement(By.id("username"));
		uid.sendKeys(email);

		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys(pass);
		System.out.println("smoke uid,pswd");

	}

	@When("user clk login btn")
	public void user_clk_login_btn() throws InterruptedException, IOException {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		Thread.sleep(3000);
		System.out.println("smoke login");

	}

	@When("you must be displayed with error  message the {string}")
	public void you_must_be_displayed_with_error_message_the(String combination) throws IOException {
		if (combination.equals("positive")) {
			urlAssertionForvalidLogin();
		} else if (combination.equals("negative")) {
			urlAssertionForInvalidLogin();
		}
		System.out.println("smoke combination");

	}

	@When("user clk login botton")
	public void user_clk_login_botton() {
		System.out.println("regression clk login botton");
	}

	@Then("user must be in invalid login page")
	public void user_must_be_in_invalid_login_page() {
		System.out.println("regression invalid login page");
	}
	
	@Then("user select location,hotels,roomtype,roomno,checkin,checkout,adultperroom,childperroom,searchbtn,Submit,radiobutton,countinue,first_name,last_name,address,cc_num,cc_type,cc_exp_month,cc_exp_year,cc_cvv,book_now")
	public void user_select_location_hotels_roomtype_roomno_checkin_checkout_adultperroom_childperroom_searchbtn_Submit_radiobutton_countinue_first_name_last_name_address_cc_num_cc_type_cc_exp_month_cc_exp_year_cc_cvv_book_now() {
		System.out.println("stared correctly");
		driver.findElement(By.name("location")).sendKeys("sydneyyyy");
		driver.findElement(By.name("hotels")).sendKeys("Hotel Hervey");
		driver.findElement(By.name("room_type")).sendKeys("Deluxe");
		driver.findElement(By.name("room_nos")).sendKeys("1");

		WebElement checkin = driver.findElement(By.name("datepick_in"));
		checkin.clear();
		checkin.sendKeys("21/07/2021");

		WebElement checkout = driver.findElement(By.name("datepick_out"));
		checkout.clear();
		checkout.sendKeys("29/07/2021");

		driver.findElement(By.name("adult_room")).sendKeys("2");
		driver.findElement(By.name("child_room")).sendKeys("0	");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.name("radiobutton_0")).click();
		driver.findElement(By.name("continue")).click();

		driver.findElement(By.name("first_name")).sendKeys("wiki");
		driver.findElement(By.name("last_name")).sendKeys("R");
		driver.findElement(By.name("address")).sendKeys("chennai");
		driver.findElement(By.name("cc_num")).sendKeys("123456789123456789");
		driver.findElement(By.name("cc_type")).sendKeys("American Express");
		driver.findElement(By.name("cc_exp_month")).sendKeys("April");
		driver.findElement(By.name("cc_exp_year")).sendKeys("2025");
		driver.findElement(By.name("cc_cvv")).sendKeys("003");
		driver.findElement(By.name("book_now")).click();
		System.out.println("ended correctly");
	
	}
	
	

//	@Then("user select location,hotels,roomtype,roomno,checkin,checkout,adultperroom,"
//			+ "childperroom,searchbtn ,Submit,radiobutton,continue,first_name,last_name,"
//			+ " address,cc_num,cc_type,cc_exp_month,cc_exp_year,cc_cvv,book_now ")
//	public void user
//	select location,hotels,roomtype,roomno,checkin,checkout,adultperroom,
//	 childperroom,searchbtn ,Submit,radiobutton,countinue,first_name,last_name,
//	  address,cc_num,cc_type,cc_exp_month,cc_exp_year,cc_cvv,book_now()
//	{
//		
	
}


//And user select location,hotels,roomtype,roomno,checkin,checkout,adultperroom,childperroom,searchbtn,Submit,radiobutton,countinue,first_name,last_name,
//address,cc_num,cc_type,cc_exp_month,cc_exp_year,cc_cvv,book_now



//	Then user select location,hotels,roomtype,roomno,checkin,checkout,adultperroom,childperroom,
//    searchbtn,Submit,radiobutton,countinue,first_name,last_name,
//	  address,cc_num,cc_type,cc_exp_month,cc_exp_year,cc_cvv,book_now
