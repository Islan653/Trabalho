
package steps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import drivers.Drivers;
import pages.HomePage;

public class LoginSteps {

	private WebDriver driver;

	private HomePage home;

	@BeforeEach
	public void setup() {
		driver = Drivers.criarDriver();
		home = new HomePage(driver);
	}

	@AfterEach
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	@Test
	public void loginSucesso() {
		home.login("standard_user", "secret_sauce");

	}

}
