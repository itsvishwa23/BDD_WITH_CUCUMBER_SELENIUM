package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Login.feature", glue = { "StepDefinations" }, plugin = {
		"pretty", "html:target/HtmlReports/report.html" })
public class Login_Runner {

}
