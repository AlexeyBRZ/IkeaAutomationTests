package org.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage removeProductFromCart() {
        By removeFromCartBtnLocator = By.xpath("//span[text()='BILLY']//ancestor::div[@class='item itemProduct']//span[text()='Remove']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(removeFromCartBtnLocator))
                .click();
        return new CartPage(driver);
    }

    public boolean isProductRemoved() {
        driver.findElement(By.xpath("//span[text()='BILLY']")).isDisplayed();
        return true;
    }
}

