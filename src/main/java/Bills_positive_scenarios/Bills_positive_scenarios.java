package Bills_positive_scenarios;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import Reusable_functions.Generic_functions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Bills_positive_scenarios extends Generic_functions {
	public static String exacttext,str;
	public static boolean value;
	
	@Given("App is open")
	public void app_is_open() {
		try {
				app_launch();
				page_wait(20);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	/*TC 001 -Validate that user can able to click on Bills tile from the home page tiles */
	@When("Click on Bills and verify that the user should be navigated to bills page")
	public void bills_positive_tc_001() throws Exception {
		try {
			click("welcome_login");
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",0));
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_password"))).sendKeys(td_reader("login_password",0));
			page_wait(10);
			click("login");
			page_wait(30);
			click("services");
			click("bills");
	    } catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("bills_positive_tc_001");
		}		
		}
	
	/*TC 002 - Validate that the user can able to view Total bills due below the Bills title*/
	@Given("Total bills due and amount should be visible on the page")
	public void bills_positive_tc_002() throws Exception {
		try {
			page_wait(50);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "bills_total_bills_due"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("bills_positive_tc_002");
		}		
	}
	
	/*TC 003 - Validate that the user can able to select Newest option from the dropdown*/
	@Given("Click on dropdown and select Newest")
	public void bills_positive_tc_003() throws Exception {
		try {
			page_wait(20);
			click("bills_oldest");
			exacttext = td_reader("bills_newest");
			scrolldown(exacttext);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("bills_positive_tc_003");
		}		
	}
	
	/*TC 004 - Validate that the user can view bills as two sections such as Due and Paid*/
	@Given("Click on Due section and click on Paid section")
	public void bills_positive_tc_004() throws Exception {
	try {
		    page_wait(20);
			click("bills_paid");
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "bills_paid_assert"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("bills_due");
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "bills_due_assert"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("bills_positive_tc_004");
		}
	}
	
	/*TC 005 - Validate that user can slide the grid below the Bills page title.*/
	@Given("Slide through Total bills due Verify that Your expenses grid is visible")
	public void bills_positive_tc_005() throws Exception {
		try {
			page_wait(20);
            click("bills_slide");
            value = driver.findElement(By.xpath(OR_reader("Object Locator", "bills_gotohome"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("bills_positive_tc_005");
		}
	}
	
	/*TC 008 - Validate that the user will get validation message when expense is $0*/
	@Given("you have no expenditures yet. Use a service or upload a bill to pay message should be displayed on the page")
	public void bills_positive_tc_008() throws Exception {
		try {
			page_wait(20);
			str= driver.findElement(By.xpath(OR_reader("Object Locator","bills_slide"))).getText();
			Assert.assertEquals(str,td_reader("bills_slide"));
			click("bills_slide_dot");
			page_wait(20);
			str= driver.findElement(By.xpath(OR_reader("Object Locator","bills_slide"))).getText();
			Assert.assertEquals(str,td_reader("bills_slide"));
			click("home");
			click("hamburger");
			click("logout");
			close();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("bills_positive_tc_008");
		}
		
	}
}
