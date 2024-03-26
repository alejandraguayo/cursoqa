package cursoqa.clase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start.maximized");
        options.addArguments("incognito");


        options.setPageLoadTimeout(Duration.ofSeconds(60));
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

        this.driver = new ChromeDriver(options);
    }

    @Test
    public void validarHome() {
        //Paso 1: Levantar la página
        this.driver.get("https://opencart.abstracta.us/");
        // Paso 2: Realizar las aserciones
        By inputBy = By.name("search");
        By inputBy2 = By.xpath("// input[@name= ' search ']]");

    }

    @AfterMethod
    public void tearDown() {
        if (this.driver != null) {
            this.driver.quit();

        }
    }
}