package org.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfficePage {

    private WebDriver driver;

    public OfficePage(WebDriver driver) {
        this.driver = driver;
    }

    public DesksPage selectDesksCategory() {
        driver.findElement(By.xpath("//a[@href='/rooms/office/desks']")).click();
        return new DesksPage(driver);
    }
}
