package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Google_Search.feature", glue = {
		"StepDefinations" }, plugin = { "pretty", "html:target/HtmlReports/report.html" })

public class Google_Search_Runner {

}
