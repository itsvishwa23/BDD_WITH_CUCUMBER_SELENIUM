package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google_Search_Steps {

	WebDriver driver = new ChromeDriver();

	@Given("I open the browser")
	public void i_open_the_browser() {

		driver.get("https://www.google.co.in/");
	}

	@Given("I navigate to Google Search")
	public void i_navigate_to() {

		driver.findElement(By.id("APjFqb")).sendKeys("Pune");

	}

	@When("I search for Pune")
	public void i_search_for() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		Thread.sleep(5000);
	}

	@Then("the search results should include City in Maharashtra")
	public void the_search_results_should_include_city_in_maharashtra() {

		if (driver.getPageSource().contains("City in Maharashtra")) {
			System.out.println("User is logged in and test is passed");

		} else {
			System.out.println("User is not logged in and test is failed");
		}

		driver.quit();
	}

}
