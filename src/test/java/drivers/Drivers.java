package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Drivers {

	public static WebDriver criarDriver() {
     ChromeOptions options = new ChromeOptions();
     //options.addArguments("--headless--");
	options.addArguments("start--maximized-");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.saucedemo.com/");
	return driver;
		
		
		
		
		
		
		
		
		
	}

}
