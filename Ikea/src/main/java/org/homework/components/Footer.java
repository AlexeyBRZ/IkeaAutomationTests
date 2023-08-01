package org.homework.components;

import org.homework.pages.TermsAndConditionsPage;
import org.homework.pages.ThisIsIkeaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Footer {

    private final WebDriver driver;

    public Footer(WebDriver driver) {
        this.driver = driver;
    }

    public ThisIsIkeaPage clickAboutIkeaInFooter(String linkName) {
        driver.findElement(By.xpath("//footer//a[text()='" + linkName + "']")).click();
        return new ThisIsIkeaPage(driver);
    }

    public TermsAndConditionsPage clickTermAndCondInFooter(String linkName) {
        driver.findElement(By.xpath("//footer//a[text()='" + linkName + "']")).click();
        return new TermsAndConditionsPage(driver);
    }
}
