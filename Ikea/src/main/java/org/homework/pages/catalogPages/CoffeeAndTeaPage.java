package org.homework.pages.catalogPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoffeeAndTeaPage {
    private final WebDriver driver;
    private By cupsAndMugsImgLocator = By.xpath("//a[@href=\"/en/rooms/dining-room/coffee-and-tea/cups-mugs\"]");

    public CoffeeAndTeaPage(WebDriver driver) {
        this.driver = driver;
    }

    public CupsAndMugsPage clickCupsAndMugsImg() {
        driver.findElement(cupsAndMugsImgLocator).click();
        return new CupsAndMugsPage(driver);
    }
}
