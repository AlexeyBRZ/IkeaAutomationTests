package org.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResultsPage {
    private final WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResultsPage clickCurrentlyInStockCheckBox() {
        By currentlyInStockCheckBoxLocator = By.xpath("//div[@id='newFilters']//label[@for='is_buyable']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(currentlyInStockCheckBoxLocator))
                .click();
        return new SearchResultsPage(driver);
    }

    //div[@id='newFilters']//input[@id="is_new"]
    //div[@id='newFilters']//label[@for="is_new"]
    //div[@id='contentWrapper']//div[@id='newFilters']//label[@for='is_new']
    //label[@for='is_new']//parent::span[@class='icheck icheck_flat ']
    public SearchResultsPage clickNewCheckBox() {
        By newCheckBoxLocator = By.xpath("//label[@for='is_new']//parent::span[@class='icheck icheck_flat ']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(newCheckBoxLocator))
                .click();
        return this;
    }

    public WebElement getSortByDropDown() {
        return driver.findElement(By.xpath("//div[@class='filterContainer']//div[@id='orderFilter']"));
    }
}
