package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import drivers.Drivers;
import elementos.Elementos;
import metodos.Metodos;
import pages.HomePage;

public class LogoutTest {

	
	
	private WebDriver driver;
	HomePage home;
	Metodos metodos;
	Elementos el = new Elementos();
	
	
	
	@BeforeEach
	public void setup() {
		
		driver = Drivers.criarDriver();
		metodos = new Metodos(driver);
		home = new HomePage(driver);
		metodos.escrever(el.userName,"standard_user");
		metodos.escrever(el.senha, "secret_sauce");
		metodos.clicar(el.btnLogin);
	}
	
	
	@AfterEach
	public void tearDown() {
		
		if(driver != null) {
			driver.quit();
		}
	}
		
		
		@Test
		public void logoutSucesso() {
			
			metodos.clicar(el.btnBurger);
			metodos.clicar(el.logout);
			
		}
		
		
		
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

