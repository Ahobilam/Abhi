package StepDefinitions;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.loginPageFactory;

public class loginstepDefinition {
	static WebDriver driver;
	loginPageFactory login;
	

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();

	}

	@When("user enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String username,String password) {
		login = new loginPageFactory(driver);
		login.enterusername(username);
		login.enterpassword(password);	
		login.clicOnLogin();

	}



	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
       login.validateLogo();
	}

	@And("close the browser")
	public void close_the_browser() {
     driver.quit();
	}

}
