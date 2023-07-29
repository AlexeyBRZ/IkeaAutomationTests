package org.homework.components;

import org.homework.pages.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CartModalWindow {

    private final WebDriver driver;

    public CartModalWindow(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getProductInCartModalWindow(String productName) {
        By productInCartLocator = By.xpath("//div[@class='modal-content modal-buy']//div[@class='additems_list']//article[@class='item']//div[text()='" + productName + "']");
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(productInCartLocator));
    }

    public CartPage clickGoToShoppingCartBtn() {
        By goToCartBtnLocator = By.xpath("//div[@class='modal-footer d-block']//button[@data-action='goCart']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(goToCartBtnLocator))
                .click();
        return new CartPage();
    }
}


