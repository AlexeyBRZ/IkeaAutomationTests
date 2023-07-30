package org.homework.products;

import org.homework.components.CartModalWindow;
import org.homework.components.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    private final WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public Header getHeader() {
        return new Header(driver);
    }

    public CartModalWindow clickAddToShoppingCartBtn() {
        driver.findElement(By.xpath("//button[@data-action='buy']")).click();
        return new CartModalWindow(driver);
    }

    public WebElement getMaterialsBlockBtn() {
        return driver.findElement(By.xpath("//a[@id=\"pills-environment-tab\"]"));
    }

    public ProductPage clickAddToFavouritesBtn() {
        driver.findElement(By.xpath("//button[@data-action='favorites']")).click();
        return this;
    }
}