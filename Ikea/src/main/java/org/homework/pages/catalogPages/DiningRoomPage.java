package org.homework.pages.catalogPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DiningRoomPage {
    private final WebDriver driver;
    private final By diningTablesLocator = By.xpath("//a[@href='/en/rooms/dining-room/dining-tables']");
    private final By diningRoomLightningLocator = By.xpath("//a[@href='/en/rooms/dining-room/dining-room-lighting']");
    private final By cabinetsAndDisplayCabinetsLocator = By.xpath("//a[@href='/en/rooms/dining-room/cabinets-display-cabinets']");

    public DiningRoomPage(WebDriver driver) {
        this.driver = driver;
    }

    public DiningTablesPage selectDiningTablesCategory() {
        driver.findElement(diningTablesLocator).click();
        return new DiningTablesPage(driver);
    }

    public CabinetsDisplayCabinetsPage selectCabinetsDisplayCabinetsCategory() {
        driver.findElement(cabinetsAndDisplayCabinetsLocator).click();
        return new CabinetsDisplayCabinetsPage(driver);
    }

    public DinningRoomLightningPage selectDiningRoomLightningCategory() {
        driver.findElement(diningRoomLightningLocator).click();
        return new DinningRoomLightningPage(driver);
    }
}

