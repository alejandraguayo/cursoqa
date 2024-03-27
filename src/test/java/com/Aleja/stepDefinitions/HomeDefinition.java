package com.Aleja.stepDefinitions;

import com.Aleja.Pages.HomePage;
import com.Aleja.hooks.Hooks;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class HomeDefinition {
    public HomeDefinition() {
        @Dado ("que el usuario ingresa a la pantalla de inicio")

    }
    private HomePage homePage;

    public void HomeDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la pantalla de inicio")
    public void queElUsuarioIngresaALaPantallaDeInicio() {
        Hooks.getDriver().get(Hooks.getProperty("url"));
    }

    @Entonces("se valida que la pantalla de incio se muestre correctamente")
    public void seValidaQueLaPantallaDeIncioSeMuestreCorrectamente() {
        Assert.assertTrue(homePage.inputIsDisplayed());
        Assert.assertTrue(homePage.carrouselIsDisplayed());
        Assert.assertTrue(homePage.menuIsDisplayed());
        Assert.assertTrue(homePage.myAccountIsDisplayed());
    }
}

