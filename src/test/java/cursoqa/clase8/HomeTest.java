package cursoqa.clase8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class HomeTest extends BaseTest {
    @Test
    public void validarHome() {

        // Paso 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // Paso 2: realizar las aserciones
        By inputBy = By.name("search");
        By carruselBy = By.id("content");
        By menuBy = By.id("menu");
        By myAccountBy = By.xpath("//a[@title= \' My Account \' ] ");

        WebElement inputEl = getDriver().findElement(inputBy);
        WebElement carruselEl = getDriver().findElement(carruselBy);
        WebElement menuEl = getDriver().findElement(menuBy);
        WebElement myAccountEl = getDriver().findElement(myAccountBy);



        Assert.assertTrue(inputEl.isDisplayed());
        Assert.assertTrue(carruselEl.isDisplayed());
        Assert.assertTrue(menuEl.isDisplayed());
        Assert.assertTrue(myAccountEl.isDisplayed());
    }
}



