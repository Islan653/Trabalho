package testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import drivers.Drivers;
import pages.HomePage;

public class ComprarProdutoTest {

	private WebDriver driver;
	HomePage home;

	@BeforeEach
	public void setup() {
		driver = Drivers.criarDriver();
		home = new HomePage(driver);

	}
	
	@Test
  public void comprarProduto() {
		home.login("standard_user", "secret_sauce");
		home.addCarrinho("Sauce Labs Backpack");
		home.validarCarrinho();
		
		
	}
	


}
