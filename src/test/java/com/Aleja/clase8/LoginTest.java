package com.Aleja.clase8;
import com.Aleja.Pages.AccountPage;
import com.Aleja.Pages.HomePage;
import com.Aleja.Pages.LoginPage;
import com.Aleja.Pages.MyAccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginTest extends BaseTest {
    @Test
    public void loginTest() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        // Paso 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        //Paso 2: click en My Account
        homePage.clickMyAccount();

        //Paso 3: click en el dropdown
        homePage.clickLoginDropdown();


        // Paso 4: hacer login (ingresar user, pass y click en boton login)
//        loginPage.setEmail("cursolunes@gmail.com");
//        loginPage.setPassword("cursolunes");
//        loginPage.clickLogin();
        loginPage.login ("alejandrguayo@outlook.es", "\"$pYJwn3mpnZmr9\"");

        // Paso 5: validaciones
        Assert.assertTrue(myAccountPage.titleIsDisplayed());
    }

    @Test
    public void loginInvalid() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        // Paso 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // Paso 2: click en My Account
        homePage.clickMyAccount();

        // Paso 3: click en Login del dropdown
        homePage.clickLoginDropdown();

        // Paso 4: hacer login (ingresar user, pass y click en boton login)
        loginPage.login ("alejandraguayo9@outlook.es", "\"$pYJwn3mpnZmr9\"");

        // Paso 5: validaciones
        Assert.assertTrue(loginPage.credentialsErrorIsDisplayed());
    }
}