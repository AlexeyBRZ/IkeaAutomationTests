package org.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DesksPage {

    private WebDriver driver;

    public DesksPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomeDesksPage selectHomeDesksCategory() {
        driver.findElement(By.xpath("//a[@href='/rooms/office/desks/home-desks']//img")).click();
        return new HomeDesksPage(driver);
    }
}
