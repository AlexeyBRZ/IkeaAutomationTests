package org.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DiningRoomPage {
    private final WebDriver driver;
    private final By sideBoardsImgLocator = By.xpath("//a[@href='/en/rooms/dining-room/side-boards']");
    private final By displayCabinetsLocator = By.xpath("//a[@href='/en/rooms/dining-room/display-cabinets']");
    private final By coffeeAndTeaLocator = By.xpath("//a[@href='/en/rooms/dining-room/coffee-and-tea']");
    public DiningRoomPage(WebDriver driver) {
        this.driver = driver;
    }

    public SideBoardsPage selectSideBoardsCategory() {
        driver.findElement(sideBoardsImgLocator).click();
        return new SideBoardsPage(driver);
    }

    public DisplayCabinetsPage selectDisplayCabinetsCategory() {
        driver.findElement(displayCabinetsLocator).click();
        return new DisplayCabinetsPage(driver);
    }

    public CoffeeAndTeaPage selectCoffeeAndTeaCategory() {
        driver.findElement(coffeeAndTeaLocator).click();
        return new CoffeeAndTeaPage(driver);
    }
}

