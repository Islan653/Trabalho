package elementos;

import org.openqa.selenium.By;

public class Elementos {
	 
	
public By userName = By.xpath("//input[@data-test='username']");
public By senha = By.id("password");
public By btnLogin = By.id("login-button");
public By btnCart = By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']");
public By carrinho = By.xpath("//a[@data-test='shopping-cart-link']");
public By checkout = By.id("checkout");
public By nome = By.id("first-name");
public By sobrenome = By.id("last-name");
public By numero = By.id("postal-code");
public By btnContinuar = By.id("continue");
public By btnFinish = By.id("finish");

/***
 * Elementos logout
 * 
 */
	
	public By btnBurger = By.xpath("//button[@id='react-burger-menu-btn']");
	public By logout = By.xpath("//a[@id='logout_sidebar_link']");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
