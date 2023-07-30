package org.homework.pages;

import org.homework.products.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CoffeeAndTeaPage {
    private final WebDriver driver;
    public CoffeeAndTeaPage(WebDriver driver) {
        this.driver = driver;
    }

    private By cupsAndMugsImgLocator = By.xpath("//a[@href=\"/en/rooms/dining-room/coffee-and-tea/cups-mugs\"]");

    public CupsAndMugsPage clickCupsAndMugsImg() {
        driver.findElement(cupsAndMugsImgLocator).click();
        return new CupsAndMugsPage(driver);
    }
}
