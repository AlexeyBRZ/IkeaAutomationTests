package org.homework.pages;

import org.homework.products.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResultsPage {
    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    //div[@id='newFilters']//input[@id="is_buyable"]
    //div[@id='newFilters']//input[@id="is_buyable"]//following-sibling::ins
    public SearchResultsPage clickCurrentlyInStockCheckBox(){
        By currentlyInStockCheckBoxLocator = By.xpath("//div[@id='newFilters']//input[@id=\"is_buyable\"]//following-sibling::ins");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(currentlyInStockCheckBoxLocator))
                .click();
   //     driver.findElement(By.xpath("//div[@id='newFilters']//input[@id=\"is_buyable\"]//following-sibling::ins")).click();
        return this;
    }

    public CartPage removeProductFromCart() {
        By removeFromCartBtnLocator = By.xpath("//span[text()='BILLY']//ancestor::div[@class='item itemProduct']//span[text()='Remove']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(removeFromCartBtnLocator))
                .click();
        return new CartPage();
    }

    public SearchResultsPage clickNewCheckBox(){
        driver.findElement(By.xpath("//div[@id='newFilters']//input[@id=\"is_new\"]")).click();
        return this;
    }

    public WebElement getSortByDropDown(){
       return driver.findElement(By.xpath("//div[@class='filterContainer']//div[@id='orderFilter']"));
    }
}
