package Login_positive_scenario;

import org.openqa.selenium.By;
import org.testng.Assert;
import Reusable_functions.Generic_functions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_positive_scenario extends Generic_functions{
	public static boolean value;

	/* Application Launch*/
	@Given("App is open")
	public void app_launching() throws Exception {
		try {
			app_launch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

	/*TC 001 - Validate that the'Phone number' field is prefixed with '+1' country code*/
	@Then("check  the  Phone number  field is prefixed with country code")	
	public static void login_positive_tc_001() throws Exception {
		try {
			page_wait(2);
			click("welcome_login");
			page_wait(30);
			value = driver.findElement(By.xpath(OR_reader("Object Locator","plus_one"))).isDisplayed();
			Assert.assertEquals(true,value);
			System.out.println("pass1");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_tc_001");
		}
	}

	/*TC 002 - Validate that the user is able to click on the 'Forgot password?' link*/
	@Given("User click on Forgot password")	
	public static void login_positive_tc_002() throws Exception {
		try {
//			page_wait(10);
//			click("forgot_password_link");
//			value = driver.findElement(By.xpath(OR_reader("Object Locator", "send_resend_link"))).isDisplayed();
//			Assert.assertEquals(true,value);
//			System.out.println("pass2");
//			page_wait(10);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_tc_002");
		}
	}

	/*TC 003 - Validate that the user is able click on the 'Sign up' link*/
	@Given("User click on Sign up")	
	public static void login_positive_tc_003() throws Exception {
		try {
//			page_wait(2);
//			click("forgot_signup_link");
//			page_wait(10);
//			value = driver.findElement(By.xpath(OR_reader("Object Locator", "signup_first_name"))).isDisplayed();
//			Assert.assertEquals(true,value);
//			System.out.println("pass3");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_tc_003");
		}
	}

	/*TC 004 - Validate that the user is able to enter password on the Password field*/
	@Given("User enter  the Password")	
	public static void login_positive_tc_004() throws Exception {
		try {
//			page_wait(10);
//			click("login_link");
//			page_wait(10);
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_password"))).sendKeys(td_reader("login_password",1));		
			page_wait(10);
			System.out.println("pass4");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_tc_004");
		}
	}

	/*TC 005 - Validate that the user User enters valid phonenumber and password and User click on login*/
	@When("User enters valid phonenumber and password and User click on login")	
	public static void login_positive_tc_005() throws Exception {		
		try {
			page_wait(10);
			field_clear("login_password");
			page_wait(10);
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",0));
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_password"))).sendKeys(td_reader("login_password",0));
			click("login");
			page_wait(30);
			System.out.println("pass5");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_tc_005");
		}
	}

	/*TC 006 - Validate that the user is navigated to 'Landing page' on clicking the 'Log out' option*/
	@Given("User click on Logout")	
	public static void login_positive_tc_006() throws Exception {
		try {
			page_wait(30);
			click("home");
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "hamburger"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_wait(30);
			click("hamburger");
			click("logout");
			System.out.println("pass6");
			page_back();
			close();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_positive_tc_006");
		}
	}
}