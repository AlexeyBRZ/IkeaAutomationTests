package org.homework.pages.commonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ThisIsIkeaPage {
    private WebDriver driver;

    public ThisIsIkeaPage(WebDriver driver) {
        this.driver = driver;
    }

    public NewsRoomPage followNewsRoomLink(String link) {
        By newsRoomLinkLocator = By.xpath("//div[@id='smContainerToggler']//p[text()='" + link + "']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(newsRoomLinkLocator))
                .click();
        return new NewsRoomPage(driver);
    }
}
