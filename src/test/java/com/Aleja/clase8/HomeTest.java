package com.Aleja.clase8;
import com.Aleja.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class HomeTest extends BaseTest {
    @Test
    public void validarHome() {
        HomePage homePage = new HomePage(getDriver());

        // Paso 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // Paso 2: realizar las aserciones


        Assert.assertTrue(homePage.inputIsDisplayed());
        Assert.assertTrue(homePage.carruselIsDisplayed());
        Assert.assertTrue(homePage.menuIsDisplayed());
        Assert.assertTrue(homePage.myAccountIsDisplayed());
    }
}




