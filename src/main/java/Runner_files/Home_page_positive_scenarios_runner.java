package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src\\main\\java\\Home_page_positive_scenarios\\Home_page_positive_scenarios.feature",
glue= {"Home_page_positive_scenarios"},
monochrome = true,publish = true)
public class Home_page_positive_scenarios_runner  extends AbstractTestNGCucumberTests{

}
