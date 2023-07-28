package org.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private WebDriver driver;

    public static String removeZero(String str) {
        int i = 0;
        while (i < str.length() & str.charAt(i) == '0') i++;
        StringBuffer sb = new StringBuffer(str);
        sb.replace(0, i, "");
        return sb.toString();
    }

    //span[text()='BILLY']//ancestor::div[@class='item itemProduct']//span[text()='Remove'] черновик икспаса
    //span[text()='BILLY']//ancestor::div[@class='item itemProduct']//i[@class='iconPos-bin icon-bind'] черновик икспаса
    public CartPage removeProductFromCart() {
        By removeFromCartBtnLocator = By.xpath("//span[text()='BILLY']//ancestor::div[@class='item itemProduct']//span[text()='Remove']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(removeFromCartBtnLocator))
                .click();
        return new CartPage();
    }

    public boolean isProductRemoved() {
        driver.findElement(By.xpath("//span[text()='BILLY']")).isDisplayed();
        return true;
    }
}

