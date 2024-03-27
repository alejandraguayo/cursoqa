package com.Aleja.stepDefinitions;

import com.Aleja.Pages.HomePage;
import com.Aleja.Pages.LoginPage;
import com.Aleja.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
    public class LoginDefinitions {
        public LoginDefinitions(){
            this.homePage = new HomePage(Hooks.getDriver());
            this.loginPage = new LoginPage(Hooks.getDriver());

        }
        private HomePage homePage;
        private LoginPage loginPage;


        @Dado("que el usuario ingresa a la página de login")
        public void queElUsuarioIngresaALaPáginaDeLogin() {
            Hooks.getDriver().get(Hooks.getProperty("url"));

            homePage.clickMyAccount();
            homePage.clickLoginDropdown();
        }

        @Cuando("el usuario se loguea con credenciales validas")
        public void elUsuarioSeLogueaConCredencialesValidas() {
            loginPage.login (Hooks.getProperty("username"), Hooks.getProperty("password"));

        }

        @Cuando("el usuario se loguea con credenciales invalidas")
        public void elUsuarioSeLogueaConCredencialesInvalidas() {
            loginPage.login ("alejandrguayo9@outlook.es", "\"$pYJwn3mpnZmr9\"");
        }
    }
