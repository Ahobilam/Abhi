package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver driver;
public login(WebDriver driver) {
		this.driver = driver;
	}
	By txt_userName = By.id("user-name");
	By txt_password= By.id("password");
	By button_Login = By.id("login-button");
	By cartSysmbol = By.xpath("shopping_cart_container");
	
	public void loginFunction(String username,String password) {
		driver.findElement(txt_userName).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(button_Login).click();
		
	}

}
