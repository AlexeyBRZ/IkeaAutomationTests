package org.homework.pages.commonPages;

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

    public CartPage removeProductFromCart(String productName) {
        By removeFromCartBtnLocator = By.xpath("//span[text()='" + productName + "']//ancestor::div[@class='item itemProduct']//span[text()='Remove']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(removeFromCartBtnLocator))
                .click();
        return new CartPage(driver);
    }

    public boolean isProductRemoved(String product) {
        try {
            driver.findElement(By.xpath("//span[text()='" + product + "']")).isDisplayed();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}

