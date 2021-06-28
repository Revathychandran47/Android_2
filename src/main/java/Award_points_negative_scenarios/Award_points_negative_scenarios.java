package Award_points_negative_scenarios;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Reusable_functions.Generic_functions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Award_points_negative_scenarios extends Generic_functions{
	public static boolean value;
	static WebElement ele;
	String ere;
	public static WebElement fr;
	static String str,text;
	static List<WebElement> grid_elements,drp_list;

	@Given("Application is open")
	public void app_is_open() {
		try {
			app_launch();
			page_wait(10);
			click("welcome_login");
			page_wait(60);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "login_page_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("User should click on Utilities tab and navigated to Utilities Dashboard")
	public static void user_should_click_on_utilities_tab_and_navigated_to_utilities_dashboard() throws IOException {
		try {
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",0));
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_password"))).sendKeys(td_reader("login_password",0));
			click("login");
			page_wait(12);
			click("utilities");
			page_wait(20);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*TC 001 - Validate that user gets validation message on entering amount more than the available amount in "Redeem Award Points" page */
	@When("User should get validation message on entering amount more than the available amount in the Enter Amount field")
	public static void Award_point_negative_tc_001() throws Exception, InterruptedException {
		try {
			click("utilities_award_points");
			click("awardpoints_redeem_button");
			click("redeem_points_giftcard");
			text = td_reader("redeem_points_giftcard");
			scrolldown(text);
			click("redeem_points_amount");
			driver.findElement(By.xpath(OR_reader("Object Locator", "redeem_points_amount"))).sendKeys(td_reader("redeem_points_amount",0));
			click("redeem_points_to_redeem");
			str= driver.findElement(By.xpath(OR_reader("Object Locator","amount_valid_msg"))).getText();
			Assert.assertEquals(str,td_reader("amount_exceed_valid_msg"));
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Award_point_negative_tc_001");
		}	

	}

	/*TC 002 - Validate that user gets validation message on entering amount less than the available amount in "Redeem Award Points" page */
	@When("User should get validation message on entering amount less than the available amount in the Enter Amount field")
	public static void Award_point_negative_tc_002() throws Exception {
		try {
			field_clear("redeem_points_amount");
			click("redeem_points_amount");
			driver.findElement(By.xpath(OR_reader("Object Locator", "redeem_points_amount"))).sendKeys(td_reader("redeem_points_amount",1));
			click("redeem_points_to_redeem");
			str= driver.findElement(By.xpath(OR_reader("Object Locator","amount_valid_msg"))).getText();
		    Assert.assertEquals(str,td_reader("amount_less_valid_msg"));
		}
		catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Award_point_negative_tc_002)");
		}
	}

	/*TC 003 -  Validate that user is not able to click on the 'Redeem' button on leaving the field 'Select a gift card' blank" */
	@When("User should get validation message clicking on the Redeem button on leaving the field Select a gift card blank")
	public static void Award_point_negative_tc_003() throws Exception, InterruptedException {
		try {
			click("utilities");
			click("utilities_award_points");
			click("awardpoints_redeem_button");
			value=driver.findElement(By.xpath(OR_reader("Object Locator", "redeem_points"))).isEnabled();
			Assert.assertEquals(value,true);
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("Award_point_negative_tc_003");
		}
	}

	/*TC 004 -  Validate that user is not able to click on the 'Redeem' button on leaving the field 'Enter Amount' blank on "Redeem Award Points" page */
	@When("User should get validation message clicking on the Redeem button on leaving the field Enter Amount blank")
	public static void Award_point_negative_tc_004() throws Exception{
		try {
			click("redeem_points_giftcard");
			text = td_reader("redeem_points_giftcard");
			scrolldown(text);
			value=driver.findElement(By.xpath(OR_reader("Object Locator", "redeem_points"))).isEnabled();
			Assert.assertEquals(value,true);
			click("home");
			page_wait(5);
			click("hamburger");
			click("logout");
			close();
		}
		catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("Award_point_negative_tc_004");
		}		
	}
}
