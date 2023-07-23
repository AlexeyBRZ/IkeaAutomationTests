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
        return sb.toString();}

    //415603
    public CartPage removeFromCart(String itemNumber) {
        By removeCertainProductFromCartBtnLocator = By.xpath("//button[@onclick='Shoppincart.removeItem(" + removeZero(itemNumber) + ")']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(removeCertainProductFromCartBtnLocator))
                .click();
        return this;
    }

//    public CartPage removeFromCart() {
//        driver.findElement(By.xpath("//button[@onclick='Shoppincart.removeItem(415603)']"));
//        return this;
//    }

    public boolean isProductRemoved(String itemNumber){
        driver.findElement(By.xpath("//div[@data-group=" + removeZero(itemNumber)  + "]")).isDisplayed();
        return true;
    }
}

