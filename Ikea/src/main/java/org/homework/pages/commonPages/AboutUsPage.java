package org.homework.pages.commonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AboutUsPage {
    private WebDriver driver;

    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public TheIkeaConceptPage clickTheIkeaConceptBtn(String link) {
        By newsRoomLinkLocator = By.xpath("//button[text()='" + link + "']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(newsRoomLinkLocator))
                .click();
        return new TheIkeaConceptPage(driver);
    }
}
