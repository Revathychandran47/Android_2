package Header_positive_scenario;

import org.openqa.selenium.By;
import org.testng.Assert;
import Reusable_functions.Generic_functions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Header_positive_scenario extends Generic_functions{
	public static boolean value;

	/* Application Launch*/
	@Given("App is open")
	public static void app_launching() throws Exception{
		try {
			app_launch();
			page_wait(20);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*TC 001 - Validate that the  mpowered health logo or hamburger should be present in the header*/
	@Then("check the mpowered health logo or hamburger  should be present in the header")
	public static void header_positive_tc_001() throws Exception {
		try {
			click("welcome_login");
			click("login_phone_number");
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",0));
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_password"))).sendKeys(td_reader("login_password",0));
			page_wait(10);
			click("login");
		    Thread.sleep(2000);
			page_wait(120);
			value = driver.findElement(By.xpath(OR_reader("Object Locator","hamburger"))).isDisplayed();
			Assert.assertEquals(true,value);
			System.out.println("1");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_positive_tc_001");
		}   
	}

	/*TC 005 -Validate that user is able to click on the 'Drop down' or hamburger tab*/
	@When("User click on Drop down or  hamburger tab  to see the drown down options")
	public static void  header_positive_tc_005() throws Exception {
		try {
			page_wait(40);
			click("hamburger");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object Locator","header_profile"))).isDisplayed();
			Assert.assertEquals(true,value);
			System.out.println("5");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_positive_tc_005");
		}
	}

	/*TC 006 -Validate that the user is navigated to the  profile page on clicking 'Your profile' tab*/
	@When("User click on Drop down tab and click on  Your profile then  navigated to the profile page.")
	public static  void header_positive_tc_006() throws Exception {
		page_wait(20);
		try {
			click("header_profile");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object Locator","profile_first_name"))).isDisplayed();
			Assert.assertEquals(true,value);
			System.out.println("6");
			page_back();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_positive_tc_006");
		}
	}

	/*TC 007 -Validate that the user is navigated to the ratings dashboard page on clicking 'Your ratings' tab*/
	@When("User click on Drop down tab and click on  Your ratings  then  navigated to the ratings dashboard page.")
	public static  void header_positive_tc_007() throws Exception {
		try {
			click("hamburger");
			page_wait(20);
			click("header_rating");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object Locator","header_rating_explore"))).isDisplayed();
			Assert.assertEquals(true,value);
			System.out.println("7");
			page_back();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_positive_tc_007");
		}
	}

	/*TC 004 -Validate that the user is navigated to the alerts page on clicking 'Your alerts' icon*/
	@When("User click on Your alerts icon navigated to the alerts page")
	public static void  header_positive_tc_004() throws Exception {
		try {
			click("hamburger");
			page_wait(20);
			click("header_alerts");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object Locator","header_alerts_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_back();
			System.out.println("4");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_positive_tc_004");
		}
	}

	/*TC 008 -Validate that the user is navigated to the 'Feedback Port'   page  on clicking 'Feedback'*/ 
	@When("User click on Drop down tab and click on  Feedback  then  navigated to the Feedback Port.")
	public static void header_positive_tc_008() throws Exception {
		try {
			click("hamburger");
			page_wait(20);
			click("header_feedback");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object Locator","header_feedback_portal"))).isDisplayed();
			Assert.assertEquals(true,value);
			System.out.println("8");
			page_back();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_positive_tc_008");
		}
	}

	/*TC 002 -Validate that the user is navigated to the help/FAQ page on clicking 'Help'/ 'FAQ' icon*/
	@When("User click on Help icon navigated to the help or FAQ page")
	public static void header_positive_tc_002() throws Exception {
		try {
			page_wait(20);
			click("header_faq");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object Locator","header_faq_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_back();
			System.out.println("2");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_positive_tc_002");
		}   
	}

	/*TC 009 -Validate that the user is navigated to the Contact Us   page  on clicking Contact us */
	@When("User click on Drop down tab and click on  Contact Us  then  navigated to the Contact Us.")
	public static void header_positive_tc_009() throws Exception {
		try {
			click("hamburger");
			page_wait(20);
			click("header_contact");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object Locator","header_contact_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_back();
			System.out.println("9");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_positive_tc_009");
		}
	}

	/*TC 010 -Validate that the user is able to see Privacy Policy dialogue box on clicking on the 'Privacy Policy' */
	@When("User click on Drop down tab and click on  Privacy Policy then dialogue box will appear")
	public static void header_positive_tc_010() throws Exception {
		try {
			click("header_privacy");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object Locator","header_privacy_ok"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_wait(20);
			click("header_privacy_ok");
			System.out.println("10");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_positive_tc_010");
		}
	}

	/*TC 011 - Validate that the user is able to see Terms & Conditions dialogue box on clicking on the 'Terms & Conditions' */
	@When("User click on Drop down tab and click on  Terms & Conditions then dialogue box will appear")
	public static void header_positive_tc_011() throws Exception {
		try {
			click("header_terms");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object Locator","header_terms_ok"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_wait(20);
			click("header_terms_ok");
			System.out.println("11");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_positive_tc_011");
		}
	}

	/*TC 003 -Validate that the user is navigated to the Landing page on clicking 'Log out' icon*/
	@When("User click on Log out icon navigated to the Landing  page")
	public static void header_positive_tc_003() throws Exception {
		try {
			click("logout");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object Locator","welcome_login"))).isDisplayed();
			Assert.assertEquals(true,value);
			page_wait(20);
			System.out.println("3");
			close();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("header_positive_tc_003");
		}
	}
}
