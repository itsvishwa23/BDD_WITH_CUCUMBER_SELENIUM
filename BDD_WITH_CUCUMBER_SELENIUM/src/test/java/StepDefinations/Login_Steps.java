package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {
	WebDriver driver = new ChromeDriver();

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		driver.get("https://practicetestautomation.com/practice-test-login/");

	}

	@When("I enter the username and password")
	public void i_enter_the_username_and_password() {

		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");

	}

	@When("I click the submit button")
	public void i_click_the_submit_button() {
		driver.findElement(By.id("submit")).click();
	}

	@Then("I should see {string}")
	public void i_should_see(String string) {

		if (driver.getPageSource().contains("Logged In Successfully")) {
			System.out.println("User is logged in and test is passed");

		} else {
			System.out.println("User is not logged in and test is failed");
		}

	}

	@Then("I close the browser")
	public void i_close_the_browser() {

		driver.quit();

	}

}
