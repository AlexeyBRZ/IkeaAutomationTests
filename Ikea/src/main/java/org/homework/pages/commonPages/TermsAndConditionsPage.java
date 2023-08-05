package org.homework.pages.commonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TermsAndConditionsPage {
    private WebDriver driver;

    public TermsAndConditionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isArticleDisplayed(String article) {
        return driver.findElement(By.xpath("//strong[contains(text(),'" + article + "')]")).isDisplayed();
    }
}
