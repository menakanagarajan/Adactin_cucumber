package com.adactin.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver driver = RunnerClass.driver;

	@Given("^user Launch The Url In Adactin Application$")
	public void user_Launch_The_Url_In_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		WebElement name = driver.findElement(By.xpath("//input[@id='username']"));
		name.sendKeys("mahaa1234");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.xpath(" //input[@id='password']"));
		password.sendKeys("123456789");
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {

		WebElement login = driver.findElement(By.xpath("//input[@id='login'] "));
		login.click();
	}

	@When("^user Select The Location In The Location Field$")
	public void user_Select_The_Location_In_The_Location_Field() throws Throwable {
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		location.click();
		Select sc = new Select(location);
		sc.selectByIndex(6);
	}

	@When("^user Select The Hotel Name In The Hotels Field$")
	public void user_Select_The_Hotel_Name_In_The_Hotels_Field() throws Throwable {
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		hotel.click();
		Select sc1 = new Select(hotel);
		sc1.selectByIndex(2);
	}

	@When("^user Select The Room Type In The Room Field$")
	public void user_Select_The_Room_Type_In_The_Room_Field() throws Throwable {
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		room.click();
		Select sc2 = new Select(room);
		sc2.selectByIndex(2);
	}

	@When("^user Select The Number Of Rooms In The Number Of Room Selection Field$")
	public void user_Select_The_Number_Of_Rooms_In_The_Number_Of_Room_Selection_Field() throws Throwable {
		WebElement room1 = driver.findElement(By.xpath("//select[@id='room_nos']"));
		room1.click();
	}

	@When("^user Pass The Date In The Check In Date Field$")
	public void user_Pass_The_Date_In_The_Check_In_Date_Field() throws Throwable {
		WebElement checkin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		checkin.click();
		checkin.clear();
		checkin.sendKeys("20/10/23");
	}

	@When("^user Pass The Date In The Check Out Date Field$")
	public void user_Pass_The_Date_In_The_Check_Out_Date_Field() throws Throwable {
		WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		checkout.clear();
		checkout.sendKeys("24/10/23");
	}

	@When("^user Select The Adults Room In The Adult Room  Dropdown Field$")
	public void user_Select_The_Adults_Room_In_The_Adult_Room_Dropdown_Field() throws Throwable {
		WebElement adultroom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		adultroom.click();
		Select sc3 = new Select(adultroom);
		sc3.selectByIndex(2);
	}

	@When("^user Select The Child Room In The Child Room Dropdown Field$")
	public void user_Select_The_Child_Room_In_The_Child_Room_Dropdown_Field() throws Throwable {
		WebElement childroom = driver.findElement(By.xpath("//select[@id='child_room']"));
		childroom.click();
		Select sc4 = new Select(childroom);
		sc4.selectByIndex(3);
	}

	@Then("^user Click The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		WebElement submit = driver.findElement(By.xpath("//input[@id='Submit']"));
		submit.click();
	}

	@When("^user Click The Select Hotel Radio Button In The Hotel Details$")
	public void user_Click_The_Select_Hotel_Radio_Button_In_The_Hotel_Details() throws Throwable {
		WebElement btn = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		btn.click();
	}

	@Then("^user Click The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		WebElement cnte = driver.findElement(By.xpath("//input[@id='continue']"));
		cnte.click();
	}

	@When("^user Enter The First Name In The First Name Field$")
	public void user_Enter_The_First_Name_In_The_First_Name_Field() throws Throwable {
		WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
		firstname.click();
		firstname.sendKeys("mahaa");
	}

	@When("^user Enter The Last Name In The Last Name Field$")
	public void user_Enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
		WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastname.click();
		lastname.sendKeys("nagarajan");
	}

	@When("^user Enter The Billing Address In The Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.click();
		address.sendKeys("chennai 636808");
	}

	@When("^user Enter The Card Details In The Credit Card Field$")
	public void user_Enter_The_Card_Details_In_The_Credit_Card_Field() throws Throwable {
		WebElement card = driver.findElement(By.xpath("(//input[@class='reg_input'])[3]"));
		card.click();
		card.sendKeys("1234567890123456");
	}

	@When("^user Select The Card Type In The Credit Card Type Dropdown$")
	public void user_Select_The_Card_Type_In_The_Credit_Card_Type_Dropdown() throws Throwable {
		WebElement cc_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
		cc_type.click();
		Select sc5 = new Select(cc_type);
		sc5.selectByIndex(3);
	}

	@When("^user Select The Expriy Month And Year In The Expiry Date Dropdown$")
	public void user_Select_The_Expriy_Month_And_Year_In_The_Expiry_Date_Dropdown() throws Throwable {
		WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		month.click();
		Select sc6 = new Select(month);
		sc6.selectByIndex(1);
		WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		year.click();
		Select sc7 = new Select(year);
		sc7.selectByIndex(2);
	}

	@When("^user Enter The Cvv NUmber In Cvv Field$")
	public void user_Enter_The_Cvv_NUmber_In_Cvv_Field() throws Throwable {
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.click();
		cvv.sendKeys("1234");
	}

	@Then("^user Click The Book Noe Button And It Navigate To Booking Confirmation Page$")
	public void user_Click_The_Book_Noe_Button_And_It_Navigate_To_Booking_Confirmation_Page() throws Throwable {
		WebElement book = driver.findElement(By.xpath("//input[@id='book_now']"));
		book.click();
	}

	@Then("^user Click The Logout Button and It Navigate to Logout Page$")
	public void user_Click_The_Logout_Button_and_It_Navigate_to_Logout_Page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement logout = driver.findElement(By.name("logout"));
		logout.click();
	}

}
