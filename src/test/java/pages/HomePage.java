
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import elementos.Elementos;
import metodos.Metodos;

public class HomePage {
	private WebDriver driver;
	private Metodos metodos;
	private Elementos el = new Elementos();

	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.metodos = new Metodos(driver);
	}

	public void login(String userName, String senha) {
		metodos.escrever(el.userName, userName);
		metodos.escrever(el.senha, senha);
		metodos.clicar(el.btnLogin);

	}

	public void addCarrinho(String nomeProduto) {
		By btnAdd = By.xpath("//div[text()='" + nomeProduto
				+ "']/ancestor::div[@class='inventory_item']//button[contains(@data-test,'add-to-cart')]");
		metodos.clicar(btnAdd);
	}

	public void validarCarrinho() {
		metodos.clicar(el.carrinho);
		metodos.clicar(el.checkout);
		metodos.escrever(el.nome, "Islan");
		metodos.escrever(el.sobrenome, "Santos");
		metodos.escrever(el.numero, "11978564543");
		metodos.clicar(el.btnContinuar);
		metodos.clicar(el.btnFinish);

	}
}
