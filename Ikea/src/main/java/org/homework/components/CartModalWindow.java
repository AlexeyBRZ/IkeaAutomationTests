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

    private By test = By.xpath("//img[@src=\"https://d2rbyiw1vv51io.cloudfront.net/web/ikea4/images/291/1129167_PE891018_S3.jpg\"]");

    private By fjallboSideBoarditemIncartLocator = By.xpath("//div[@class=\"modal-content modal-buy\"]//div[@class=\"additems_list\"]//img[@src=\"https://d2rbyiw1vv51io.cloudfront.net/web/ikea4/images/291/1129167_PE891018_S3.jpg\"]");
    public WebElement getfjallboSideBoarditemIncart(){
        return driver.findElement(test);
    }

    public CartPage clickGoToShoppingCartBtn() {
        By goToCartBtnLocator = By.xpath("//div[@class=\"modal-content modal-buy\"]//button[@data-action=\"goCart\"]//span");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(goToCartBtnLocator))
                .click();
        return new CartPage();
    }
}


