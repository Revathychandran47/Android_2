package Circles_positive_scenarios;

import Reusable_functions.Generic_functions;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Circles_positive_scenarios extends Generic_functions{
	public static boolean value;
	public static String str;

	/*Application launch*/
	@Given("App is open")
	public void applaunching() {
		try {
			app_launch();
			page_wait(10);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "welcome_page_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("welcome_login");
			page_wait(10);
			click("login_phone_number");
			page_wait(20);
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",5));
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_password"))).sendKeys(td_reader("login_password",3));
			page_wait(10);
			click("login");
			page_wait(30);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "login_page_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*TC 001 - Validate that a user is taken to the Circles page when they click on the Circles tab*/
	@Then("check user is taken to the Circles page when they click on the Circles tab")
	public void circle_positive_tc_001() throws IOException {
		try {
			click("circles");
			page_wait(12);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "circles_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();	
			takeScreenShot("circle_positive_tc_001");
		}
	}

	/*TC 002 - Validate that a user is able to click on Add a Partner and options pop up*/
	@Then("check  user is able to click on Add a Partner and options pop up")
	public void circle_positive_tc_002() throws IOException {
		try {
			page_wait(12);
			click("circles_add_partner_button");
			page_wait(12);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "circles_add_patner_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_tc_002");
		}
	}

	/*TC 003 - Validate that when a user clicks on Add a Provider option under Add a Partner drop-down, they are directed to the provider screen*/
	@Then("check  user is able to click on Add a Partner then click on Select a partner and select the My Medicare option finally click on Proceed")
	public void circle_positive_tc_003() throws IOException {
		try {
			page_wait(20);
			click("circles_add_partner_dropdown");
			page_wait(20);
			click("circles_mymedicare_option");
			page_wait(20);
			click("circles_proceed_button");
			page_wait(30);
		}
		catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_tc_003");
		}
	}
	
	/*TC 004 - Validate that the user is able to click on the 'Forgot username?' link*/
	@Then("check  user is able to click on the Forgot username? link")
	public void circle_positive_tc_004() throws IOException {
		try {
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "circles_mymedicare_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_wait(12);
			click("circles_forgot_username_link");
			page_wait(12);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "circles_forgot_username_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_back();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_tc_004");
		}
	}
	
	/*TC 005 - Validate that the user is able to click on the 'Forgot password?' link*/
	@Then("check  user is able to click on the Forgot password? link")
	public void circle_positive_tc_005() throws IOException {
		try {
			page_wait(20);
			click("circles_forgot_password_link");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "circles_forgot_password_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_back();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_tc_005");
		}
	}
	
	/*TC 006 - Validate that the user is able to enter  the Username and Password in the 'USERNAME' and 'PASSWORD' field*/
	@Then("check  user is able to enter  the Username and Password")
	public void circle_positive_tc_006() throws IOException {
		try {
			driver.findElement(By.xpath(OR_reader("Object Locator", "circles_mymedicare_username"))).sendKeys(td_reader("circles_mymedicare_username",0));
			driver.findElement(By.xpath(OR_reader("Object Locator", "circles_mymedicare_password"))).sendKeys(td_reader("circles_mymedicare_password",0));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_tc_006");
		}
	}
	
	/*TC 007 Validate that the password should be displayed on clicking the eye*/
	@Then("check  user is able to view password on clicking the eye")
	public void circle_positive_tc_007() throws IOException {
		try {
			click("circles_mymedicare_eye");
			page_wait(20);
			str =driver.findElement(By.xpath(OR_reader("Object Locator", "circles_mymedicare_password"))).getText();
			Assert.assertEquals(str,td_reader("circles_mymedicare_password"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_tc_007");
		}
	}
	
	/*TC 008 Validate that the user is able to Login with valid data*/
	@Then("check  user is able to Login with valid data")
	public void circle_positive_tc_008() throws IOException {
		try {
			page_wait(50);
			click("circles_mymedicare_login_button");
			page_wait(30);
			click("circles_mymedicare_allow_button");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_tc_008");
		} 
	}

	/*TC 012 - Validate that the user can able to view 'My Medicare’ icon in the Circles page and also it should be clickable */
	@Given("My Medicare logo should be present in the Circles page  and it should be clickable")
	public void circle_positive_tc_012() throws IOException  {
		try {
			page_wait(30);
			click("circles_mymedicare_button");
			click("circles_mymedicare_back_arrow");
			page_wait(40);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "circles_mymedicare_img_icon"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("home");
			click("hamburger");
			click("logout");
			close();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("circle_positive_tc_012");
		}
	}
}
