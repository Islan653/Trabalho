package metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

    private WebDriver driver;
    private WebDriverWait wait;

    public Metodos(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // espera padrão 10s
    }

    public void clicar(By locator) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        } catch (Exception e) {
            throw new NoSuchElementException("Elemento não encontrado ou não clicável: " + locator);
        }
    }

    public void escrever(By locator, String texto) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(texto);
        } catch (Exception e) {
            throw new NoSuchElementException("Elemento não encontrado ou não visível para escrever: " + locator);
        }
    }
    public void validarUrl(String urlEsperada) {
		try {
			assertEquals(urlEsperada, driver.getCurrentUrl());
		} catch (Exception e) {
			throw new NotFoundException(urlEsperada + " não encontrada.");
		}
}
}

