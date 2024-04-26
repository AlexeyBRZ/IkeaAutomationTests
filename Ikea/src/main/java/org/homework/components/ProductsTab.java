package org.homework.components;

import org.homework.pages.catalogPages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsTab {
    private final WebDriver driver;

    public ProductsTab(WebDriver driver) {
        this.driver = driver;
    }

    public SofasPage selectSofasCategory(String category) {
        By comfortToysLocator = By.xpath("//a[@class='dropdown-item']//span[text()='" + category + "']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(comfortToysLocator))
                .click();
        return new SofasPage(driver);
    }

    public OfficeChairsPage selectOfficeChairsCategory(String category) {
        By officeChairLocator = By.xpath("//a[@class='dropdown-item']//span[text()='" + category + "']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(officeChairLocator))
                .click();
        return new OfficeChairsPage(driver);
    }

    public GlassesPage selectGlassesCategory(String category) {
        By glassesLocator = By.xpath("//a[@class='dropdown-item']//span[text()='" + category + "']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(glassesLocator))
                .click();
        return new GlassesPage(driver);
    }

    public OutdoorsSofasPage selectOutDoorsSofasPage(String category) {
        By glassesLocator = By.xpath("//a[@class='dropdown-item']//span[text()='" + category + "']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(glassesLocator))
                .click();
        return new OutdoorsSofasPage(driver);
    }

    public FloorLampsPage selectFloorLampsPage(String category) {
        By glassesLocator = By.xpath("//a[@class='dropdown-item']//span[text()='" + category + "']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(glassesLocator))
                .click();
        return new FloorLampsPage(driver);
    }
}
