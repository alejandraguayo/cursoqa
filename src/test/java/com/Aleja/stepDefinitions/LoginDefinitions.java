package com.Aleja.stepDefinitions;

import com.Aleja.Pages.HomePage;
import com.Aleja.Pages.LoginPage;
import com.Aleja.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

public class LoginDefinitions {
    private HomePage homePage;
    private LoginPage loginPage;

    public LoginDefinitions(){
        this.homePage = new HomePage(Hooks.getDriver());
        this.loginPage = new LoginPage (Hooks.getDriver());

    }
    @Dado("que el usuario ingresa a la página de login")
    public void queElUsuarioIngresaALaPáginaDeLogin() {
        Hooks.getDriver().get("https://opencart.abstracta.us/");

        homePage.clickMyAccount();
        homePage.clickLoginDropdown();
    }

    @Cuando("el usuario se loguea con credenciales validas")
    public void elUsuarioSeLogueaConCredencialesValidas() {
        loginPage.login ("alejandrguayo@outlook.es", "\"$pYJwn3mpnZmr9\"");

    }
}
