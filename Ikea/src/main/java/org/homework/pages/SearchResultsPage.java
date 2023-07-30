package org.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

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

    public SearchResultsPage clickNewCheckBox() {
        By progressBar = By.xpath("//div[@class='busy-load-container']//span[text()='Loading ...']");
        List<WebElement> elementList = driver.findElements(progressBar);
        boolean loadingIsShown = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.invisibilityOfAllElements(elementList));
        if(loadingIsShown){
            By newCheckBoxLocator = By.xpath("//label[@for='is_new']//parent::span[@class='icheck icheck_flat ']//ins[@class='iCheck-helper']");
            boolean isSelected = new WebDriverWait(driver, Duration.ofSeconds(15))
                    .until(ExpectedConditions.elementSelectionStateToBe(newCheckBoxLocator, false));
            if (isSelected){

                driver.findElement(newCheckBoxLocator).click();
            }
        }else{
            throw new RuntimeException("Progress bar is shown");
        }
        return this;
    }

    public WebElement getSortByDropDown() {
        return driver.findElement(By.xpath("//div[@class='filterContainer']//div[@id='orderFilter']"));
    }
}
