package org.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OutdoorsSofasPage {

    private WebDriver driver;

    public OutdoorsSofasPage(WebDriver driver) {
        this.driver = driver;
    }

    public OutdoorsSofasPage clickSortByDropDown() {
        driver.findElement(By.xpath("//div[@class='filterContainer']//div[@id='orderFilter']")).click();
        return this;
    }

    public WebElement getOutDoorsCushionsLink() {
        By outDoorsCushionsLink = By.xpath("//a[@href='/rooms/outdoor/outdoor-lounge-furniture/outdoor-cushions-chair-pads']");
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(outDoorsCushionsLink));
    }

    public WebElement getFilterCategory(String filterCategory) {
        return driver.findElement(By.xpath("//div[@id='filterSelectors']//li[@data-id='" + filterCategory + "']"));
    }
}
