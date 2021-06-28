package Home_page_positive_scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Reusable_functions.Generic_functions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Home_page_positive_scenarios extends Generic_functions{
	public static boolean value;
	public static WebElement ele;
	public static String ere;
	public static boolean value1;

	@Given("Application is open")
	public static void browser_is_open() {
		try {
			app_launch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*TC-001 Validate that the user is navigated to Welcome page*/
	@And("User clicks on Welcome Login button")
	public static void home_positive_tc_001() throws Exception {
		try {
			page_wait(10);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "welcome_page_title"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("welcome_login");
		}catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("home_positive_tc_001");
		}
	}
	
	/*TC-002 Validate that the user is able to Login with valid credentials*/
	@When("User enters valid phonenumber and password and User click on login")
	public static void home_positive_tc_002() throws InterruptedException, Exception {
		try {
			click("login_phone_number");
			page_wait(20);
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",0));
			driver.findElement(By.xpath(OR_reader("Object Locator", "login_password"))).sendKeys(td_reader("login_password",0));
			page_wait(10);
			click("login");
			page_wait(30);
			value = driver.findElement(By.xpath(OR_reader("Object Locator", "login_page_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("home_positive_tc_002");
		}
		page_wait(10);
	}

	/*TC-003 Validate that the user is navigated to  the Home page and User should be able to click on all the grid tiles */
	@When("User should be able to click on all the grid tiles and it should be navigated to tile landing page according to that tile")
	public static void home_positive_tc_003() throws Exception {
		try {
			click("home_first_tile");
			page_wait(50);
			value1=driver.findElement(By.xpath(OR_reader("Object Locator", "home_dashboard_back_arrow"))).isDisplayed();
			Assert.assertEquals(true,value1);
			click("home_dashboard_back_arrow");
			click("home_second_tile");
			page_wait(50);
			value1=driver.findElement(By.xpath(OR_reader("Object Locator", "home_dashboard_back_arrow"))).isDisplayed();
			Assert.assertEquals(true,value1);
			click("home_dashboard_back_arrow");
			click("home_third_tile");
			page_wait(50);
			value1=driver.findElement(By.xpath(OR_reader("Object Locator", "home_dashboard_back_arrow"))).isDisplayed();
			Assert.assertEquals(true,value1);
			click("home_dashboard_back_arrow");
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("home_positive_tc_003");
		}
	}
	
	/*TC-004 Validate that the user is navigated to the Second Opinion page on clicking 'Request for second opinion' button*/
	@When("User should be able to click on the Request for second opinion button and navigated to the Second opinion page successfully")
	public void home_positive_tc_004() throws InterruptedException, Exception {
		try {
			click("home_so_button");
			page_wait(50);
			value1=driver.findElement(By.xpath(OR_reader("Object Locator", "so_title"))).isDisplayed();
			Assert.assertEquals(true,value1);
			page_wait(10);
			click("home_dashboard_back_arrow");
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("home_positive_tc_004");
		}		
	}

	/*TC-005 Validate that the user is navigated to the  Refer a friend page on clicking 'Refer a friend' button*/
	@When("User should be able to click on Refer a friend button and navigated to the Refer a friend page successfully")
	public static void home_positive_tc_005() throws InterruptedException, Exception {
		try {
			click("home_refer_button");
			page_wait(50);
			value1=driver.findElement(By.xpath(OR_reader("Object Locator", "refer_frnd_refer_code"))).isDisplayed();
			Assert.assertEquals(true,value1);
			page_wait(10);	
			page_back();
			close();
		}catch(Exception e) {
			e.printStackTrace();
			takeScreenShot("home_positive_tc_005");
		}		
	}
}
