package org.homework.components;

import org.homework.pages.catalogPages.DiningRoomPage;
import org.homework.pages.catalogPages.OfficePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RoomsTab {
    private final WebDriver driver;

    public RoomsTab(WebDriver driver) {
        this.driver = driver;
    }

    public DiningRoomPage clickDiningRoomsBtn(String category) {
        By diningRoomLocator = By.xpath("//div[@class='rooms']//a[text()='" + category + "']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(diningRoomLocator))
                .click();
        return new DiningRoomPage(driver);
    }

    public OfficePage clickOfficeBtn(String category) {
        By diningRoomLocator = By.xpath("//div[@class='rooms']//a[text()='" + category + "']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(diningRoomLocator))
                .click();
        return new OfficePage(driver);
    }
}

