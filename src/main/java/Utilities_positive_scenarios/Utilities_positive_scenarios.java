package Utilities_positive_scenarios;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import Reusable_functions.Generic_functions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Utilities_positive_scenarios extends Generic_functions {
	public static boolean value;
	public static String exacttext;
	
	/* Application Launch*/
	@Given("App is open")
	public void app_is_open() {
		try {
			app_launch();
			page_wait(20);
			System.out.println("app launched");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	/*TC 001 - Validate that the user is able to navigate to Utilities screen*/
	@Then("check the user is able to navigate to Utilities screen")
	public void utilities_positive_tc_001() throws Exception {
		try {
			click("welcome_login");
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",0));
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_password"))).sendKeys(td_reader("login_password",0));
			page_wait(10);
			click("login");
            click("utilities");
			page_wait(20);
			value = driver.findElement(By.xpath(OR_reader("Object Locator","utilities_wallet"))).isDisplayed();
			Assert.assertEquals(true,value);
			System.out.println("1");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_tc_001");
		}   
	} 
	
	/* TC_002-Validate that user can click options provided in the left side navigator */
	@Then("user can click options provided in the left side navigator")
	public void utilities_positive_tc_002() throws Exception  {
	try {
		    page_wait(20);
		    click("home");
	        value = driver.findElement(By.xpath(OR_reader("Object Locator","home_assert"))).isDisplayed();
			Assert.assertEquals(true,value);
            click("services");
			value = driver.findElement(By.xpath(OR_reader("Object Locator","services_assert"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("circles");
			value = driver.findElement(By.xpath(OR_reader("Object Locator","utilities_walletassert"))).isDisplayed();
			Assert.assertEquals(true,value);
			System.out.println("2");
         } catch (Exception e) {
        	 e.printStackTrace();
			takeScreenShot("utilities_positive_tc_002");
		}
	}
	
	/* TC_003 - Validate that user can check the Tiles in the Utilities dashboard */
	@Then("user can check the Tiles in the Utilities dashboard.")
	public void utilities_positive_tc_003() throws Exception {
		
		try {
			
			 click("utilities");
			 click("utilities_wallet");
			 page_wait(20);
			 value = driver.findElement(By.xpath(OR_reader("Object Locator","utilities_add_payment_method"))).isDisplayed();
			 Assert.assertEquals(true,value);
			 click("utilities_back");
			 click("utilities_awardspoints");
			 page_wait(20);
			 value = driver.findElement(By.xpath(OR_reader("Object Locator","utilities_awardspointsassert"))).isDisplayed();
		     Assert.assertEquals(true,value);
		     click("utilities_back");
			 click("utilities_idcard");
			 page_wait(20);
			 value = driver.findElement(By.xpath(OR_reader("Object Locator","utilities_idcard_ok"))).isDisplayed();
			 Assert.assertEquals(true,value);
			 page_wait(20);
			 click("utilities_idcard_ok");
			 page_wait(20);
			 click("utilities_settings");
			 page_wait(20);
			 value = driver.findElement(By.xpath(OR_reader("Object Locator","utilities_settingsassert"))).isDisplayed();
			 Assert.assertEquals(true,value);
			 page_back();
			 click("utilities_upload");
			 page_wait(20);
		     value = driver.findElement(By.xpath(OR_reader("Object Locator","utilities_upload_ok"))).isDisplayed();
			 Assert.assertEquals(true,value);
			 page_wait(20);
			 click("utilities_upload_ok");
			 System.out.println("3");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_tc_003");
		}

		
	}

	/* TC_004 - Validate that user is able to add card details  in the Wallet dashboard.*/
	@Then("User should able to add card details")
	public void utilities_positive_tc_004() throws Exception {
		try {
//			click("utilities");
//			click("utilities_wallet");
//			page_wait(10);
//			click("utilities_add_payment_method");
//			page_wait(10);
//			click("utilities_add_debit_credit_card");
//			driver.findElement(By.xpath(OR_reader("Object Locator", "utilities_addcardsaveas"))).sendKeys(td_reader("utilities_addcardsaveas"));
//			driver.findElement(By.xpath(OR_reader("Object Locator", "utilities_addcardname"))).sendKeys(td_reader("utilities_addcardname"));
//			page_wait(10);
//			driver.findElement(By.xpath(OR_reader("Object Locator", "utilities_addcardnum"))).sendKeys(td_reader("utilities_addcardnum"));
//			driver.findElement(By.xpath(OR_reader("Object Locator", "utilities_addcardexpiry"))).sendKeys(td_reader("utilities_addcardexpiry"));
//			page_wait(10);
//			driver.findElement(By.xpath(OR_reader("Object Locator", "utilities_addcardcvc"))).sendKeys(td_reader("utilities_addcardcvc"));
//			driver.findElement(By.xpath(OR_reader("Object Locator", "utilities_addcardpost"))).sendKeys(td_reader("utilities_addcardpost"));
//			page_wait(10);
//			driver.findElement(By.xpath(OR_reader("Object Locator", "utilities_addcardphonenumber"))).sendKeys(td_reader("utilities_addcardphonenumber"));
//			driver.findElement(By.xpath(OR_reader("Object Locator", "utilities_addcardaddress1"))).sendKeys(td_reader("utilities_addcardaddress1"));
//			driver.findElement(By.xpath(OR_reader("Object Locator", "utilities_addcardaddress2"))).sendKeys(td_reader("utilities_addcardaddress2"));
//			page_wait(10);
//			click("utilities_addcardscountry");
//			exacttext = td_reader("utilities_addcardscountry");
//			scrolldown(exacttext);
//			click("utilities_addcardsstate");
//			exacttext = td_reader("utilities_addcardsstate");
//			scrolldown(exacttext);
//			page_wait(10);
//			driver.findElement(By.xpath(OR_reader("Object Locator", "utilities_addcardcity"))).sendKeys(td_reader("utilities_addcardcity"));
//			click("utilities_addcardsave");
//			waitelement("utilities_addcardok");
//			click("utilities_addcardok");
			System.out.println("4");
        } catch (Exception e) {
        	e.printStackTrace();
			takeScreenShot("utilities_positive_tc_004");
		}
		
		
	}
	
	/* TC_005 - Validate that user is able to add bank details  in the Wallet dashboard*/
	@Then("User should able to add bank details")
	public void utilities_positive_tc_005() throws Exception {
		try {
//			click("utilities_add_payment_method");
//			click("utilities_addbank");
//			value = driver.findElement(By.xpath(OR_reader("Object Locator","utilities_addbankassert"))).isDisplayed();
//			Assert.assertEquals(true,value);
//			driver.findElement(By.xpath(OR_reader("Object Locator", "utilities_addbanksaveas"))).sendKeys(td_reader("utilities_addbanksaveas"));
//			driver.findElement(By.xpath(OR_reader("Object Locator", "utilities_addbankname"))).sendKeys(td_reader("utilities_addbankname"));
//			page_wait(10);
//			driver.findElement(By.xpath(OR_reader("Object Locator", "utilities_addbankrouting"))).sendKeys(td_reader("utilities_addbankrouting"));
//			click("utilities_addbankholdertype");
//			exacttext = td_reader("utilities_addbankholdertype");
//			scrolldown(exacttext);
//			driver.findElement(By.xpath(OR_reader("Object Locator", "utilities_addbankaccountno"))).sendKeys(td_reader("utilities_addbankaccountno"));
//			page_wait(10);
//			click("utilities_addbankcheckbox");
//			browser_back();
			System.out.println("5");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_tc_005");
		}
	}
	
	/* TC_008 - Validate that user is able to click on 'Deactivate' tile*/
	@Then("User should able to click on Deactivate tile")
	public void utilities_positive_tc_008() throws Exception {
		 try {
			click("utilities_back");
			click("utilities_settings");
			click("utilities_settingsdeactivate");
			value = driver.findElement(By.xpath(OR_reader("Object Locator","utilities_deactivateassert"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("utilities_deactivatecancel");
			click("home");
			click("hamburger");
			click("logout");
			System.out.println("8");
			close();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("utilities_positive_tc_008");
		}  
	}
}
