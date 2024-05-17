package org.homework.components;

import org.homework.pages.commonPages.TermsAndConditionsPage;
import org.homework.pages.commonPages.AboutUsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Footer {

    private final WebDriver driver;

    public Footer(WebDriver driver) {
        this.driver = driver;
    }

    public AboutUsPage clickAboutIkeaInFooter(String linkName) {
        driver.findElement(By.xpath("//footer//a[text()='" + linkName + "']")).click();
        return new AboutUsPage(driver);
    }

    public TermsAndConditionsPage clickTermAndCondInFooter(String linkName) {
        driver.findElement(By.xpath("//footer//a[text()='" + linkName + "']")).click();
        return new TermsAndConditionsPage(driver);
    }
}
