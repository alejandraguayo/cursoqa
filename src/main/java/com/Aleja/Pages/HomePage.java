package com.Aleja.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private By inputBy = By.name("search");
    private By carruselBy = By.id("content");
    private By menuBy = By.id("menu");
    private By myAccountBy = By.xpath("//a[@title=\'My Account\']");
    private By loginBy = By.xpath("//a[text()=\"Login\"]");
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean inputIsDisplayed() {
        WebElement inputEl = driver.findElement(inputBy);
        return inputEl.isDisplayed();
    }

    public boolean carruselIsDisplayed() {
        WebElement carruselEl = driver.findElement(carruselBy);
        return carruselEl.isDisplayed();
    }

    public boolean menuIsDisplayed() {
        WebElement menuEl = driver.findElement(menuBy);
        return menuEl.isDisplayed();
    }

    public boolean myAccountIsDisplayed() {
        WebElement myAccountEl = driver.findElement(myAccountBy);
        return myAccountEl.isDisplayed();
    }

    public void clickMyAccount() {
        By myAccountBy = By.xpath("//a[@title= \' My Account \' ] ");
        WebElement myAccountEl = driver.findElement(myAccountBy);
        myAccountEl.click();
    }

    public void clickLoginDropdown() {

    }

    {
        WebElement loginEl = driver.findElement(loginBy);
        loginEl.click();
    }
}



