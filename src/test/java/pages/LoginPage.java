
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarPagina() {
        driver.get("https://www.saucedemo.com/");
    }

    public void preencherUsuario(String user) {
        driver.findElement(By.id("user-name")).sendKeys(user);
    }

    public void preencherSenha(String senha) {
        driver.findElement(By.id("password")).sendKeys(senha);
    }

    public void clicarLogin() {
        driver.findElement(By.id("login-button")).click();
    }
}
