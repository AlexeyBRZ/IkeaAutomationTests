package org.homework.components;

import org.homework.pages.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CartModalWindow {

    private WebDriver driver;
    public CartModalWindow(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement productInCartModalWindow(String itemId){
        return driver.findElement(By.xpath("//div[@class='modal-content modal-buy']//article[@data-id='" + itemId + "']"));
    }

    public CartPage clickGoToShoppingCartBtn() {
        By goToCartBtnLocator = By.xpath("//div[@class=\"modal-content modal-buy\"]//button[@data-action=\"goCart\"]");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(goToCartBtnLocator));
        return new CartPage();
    }
}


