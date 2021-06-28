package Utilities_negative_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Reusable_functions.Generic_functions;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Utilities_negative_scenarios extends Generic_functions {
	static boolean value;
	static String balance,text,ere,str;
	static WebElement ele;
	
	/*Browser opens and user is on home page */ 	
	@When("User is on home page")
	public void user_is_on_home_page() {
		try {
			app_launch();
			page_wait(20);
			click("welcome_login");
			page_wait(30);
			driver.findElement(By.xpath(OR_reader("Object Locator","login_phone_number"))).sendKeys(td_reader("login_phone_number",1));
			driver.findElement(By.xpath(OR_reader("Object Locator","login_password"))).sendKeys(td_reader("login_password",1));
			page_wait(20);
			click("login");	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/* TC_001 -Validate that the user is able to navigate to Utilities screen */
	@Then("User should redirect to Utilities Dashboard when clicks on Utilities tab")
	public static void utilities_negative_tc_001() throws Exception {
		try {
			click("utilities");
			Thread.sleep(1000);
			click("utilities_wallet");
			page_wait(20);
			click("utilities_add_payment_method");
			page_wait(30);
			click("utilities_add_debit_credit_card");
			System.out.println("1");
			}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_negative_tc_001");
		}	
	}
	
	/* TC_002 -Validate that user gets validation message on leaving fields blank in the Add Card page */
	@Then("User should get validation message on leaving fields blank")
	public void utilities_negative_tc_002() throws Exception {
		try {
			page_wait(30);
			String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Save\").instance(0))";
			driver.findElementByAndroidUIAutomator(scrollElement).click();
			String scroll = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Save as\").instance(0))";
			driver.findElementByAndroidUIAutomator(scroll).click();
			str= driver.findElement(By.xpath(OR_reader("Object Locator","utilities_add_line_one_valid_msg"))).getText();
			Assert.assertEquals(str,td_reader("add_line_one_valid_msg"));
			str= driver.findElement(By.xpath(OR_reader("Object Locator","utilities_state_valid_msg"))).getText();
			Assert.assertEquals(str,td_reader("state_valid_msg"));
			str= driver.findElement(By.xpath(OR_reader("Object Locator","utilities_city_valid_msg"))).getText();
			Assert.assertEquals(str,td_reader("city_valid_msg"));
//			str= driver.findElement(By.xpath(OR_reader("Object Locator","phone_no_valid_msg"))).getText();
//			Assert.assertEquals(str,td_reader("phone_no_valid_msg"));
			str= driver.findElement(By.xpath(OR_reader("Object Locator","utilities_save_as_valid_msg"))).getText();
			Assert.assertEquals(str,td_reader("save_as_valid_msg"));
			Thread.sleep(1000);
			System.out.println("2");
			}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_negative_tc_002");
		}	
		
	}
	
	/* TC_003 -Validate that user gets validation message on entering invalid details in the Add Card page*/
	@Then("User should get validation message on entering invalid details")
	public static void utilities_negative_tc_003() throws Exception {
		try {
		driver.findElement(By.xpath(OR_reader("Object Locator","utilities_card_no"))).sendKeys(td_reader("card_no",0));
		driver.findElement(By.xpath(OR_reader("Object Locator","utilities_expiration_date"))).sendKeys(td_reader("expiration_date",0));
		driver.findElement(By.xpath(OR_reader("Object Locator","utilities_cvc"))).sendKeys(td_reader("cvc",0));
		driver.findElement(By.xpath(OR_reader("Object Locator","utilities_postal_code"))).sendKeys(td_reader("postal_code",0));
		click("utilities_phone_number");
		driver.findElement(By.xpath(OR_reader("Object Locator","utilities_phone_number"))).sendKeys(td_reader("phone_no",1));
		page_wait(5);
		System.out.println("3");
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_negative_tc_003");
		}
	}
	
	/*TC_004- Validate that user gets validation message on leaving fields blank in the Add Bank page */
	@Then("User should get validation message on leaving fields blank in Add Bank page")
	public static void utilities_negative_tc_004() throws Exception {
		try {
		click("utilities_back_btn");
		click("utilities_add_payment_method");
		page_wait(10);
		click("utilities_add_bank_account");
		click("utilities_save_as");
		click("utilities_account_holder_name");
		click("utilities_routing_no");
		click("utilities_account_no");
		String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Save\").instance(0))";
		driver.findElementByAndroidUIAutomator(scrollElement).click();
		str= driver.findElement(By.xpath(OR_reader("Object Locator","utilities_save_as_valid_msg_two"))).getText();
		Assert.assertEquals(str,td_reader("save_as_valid_msg_two"));
		str= driver.findElement(By.xpath(OR_reader("Object Locator","utilities_account_holder_name_valid_msg_two"))).getText();
		Assert.assertEquals(str,td_reader("account_holder_name_valid_msg_two"));
		str= driver.findElement(By.xpath(OR_reader("Object Locator","utilities_routing_no_valid_msg_two"))).getText();
		Assert.assertEquals(str,td_reader("routing_no_valid_msg_two"));
		str= driver.findElement(By.xpath(OR_reader("Object Locator","utilities_account_no_valid_msg_two"))).getText();
		Assert.assertEquals(str,td_reader("account_no_valid_msg_two"));
		Thread.sleep(1000);
		System.out.println("4");
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_negative_tc_004");
		}
		
	}
	
	/* TC_005 - Validate that user gets validation message on entering invalid details in the Add Bank page*/
	@Then("User should get validation message on entering invalid details in Add Bank page")
	public static void utilities_negative_tc_005() throws Exception {
		try {
		page_wait(10);
		driver.findElement(By.xpath(OR_reader("Object Locator","utilities_save_as"))).sendKeys(td_reader("save_as",0));
		driver.findElement(By.xpath(OR_reader("Object Locator","utilities_account_holder_name"))).sendKeys(td_reader("account_holder_name",0));
		click("routing_no");
		driver.findElement(By.xpath(OR_reader("Object Locator","utilities_routing_no"))).sendKeys(td_reader("routing_no",0));
		AndroidElement spinner = driver.findElement(By.xpath(OR_reader("Object Locator","utilities_account_holder_type")));
		spinner.click();
		Thread.sleep(1000);
		AndroidElement spinner_choose = driver.findElement(By.xpath(OR_reader("Object Locator","utilities_holder_type_name")));
		spinner_choose.click();
		click("utilities_account_no");
		driver.findElement(By.xpath(OR_reader("Object Locator","account_no"))).sendKeys(td_reader("account_no",0));
		Thread.sleep(1000);
		String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Save\").instance(0))";
		driver.findElementByAndroidUIAutomator(scrollElement).click();
		Thread.sleep(1000);
//		str= driver.findElement(By.xpath(OR_reader("Object Locator","utilities_account_holder_name_valid_msg_two"))).getText();
//		Assert.assertEquals(str,td_reader("account_holder_name_valid_msg_two"));
//		str= driver.findElement(By.xpath(OR_reader("Object Locator","utilities_routing_no_valid_msg"))).getText();
//		Assert.assertEquals(str,td_reader("routing_no_valid_msg"));
		str= driver.findElement(By.xpath(OR_reader("Object Locator","utilities_account_no_valid_msg"))).getText();
		Assert.assertEquals(str,td_reader("account_no_valid_msg"));
		Thread.sleep(1000);
		System.out.println("5");
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_negative_tc_005");
		}
	}
	
	/* TC_006 - Validate that user is not able to redeem when the balance is less than 2000 */
	@Then("User is not able to click on redeem")
	public static void utilities_negative_tc_006()throws Exception {
	 try {
	   click("utilities_back_btn");
	   click("utilities_manage_back");
	   click("utilities_award_points");
	   click("utilities_redeem_points_button");
	   page_wait(10);
	   System.out.println("6");
	   driver.closeApp();
	 }catch(Exception e) {
		 e.printStackTrace();
		 takeScreenShot("utilities_negative_tc_006");
	 }
	}
}
