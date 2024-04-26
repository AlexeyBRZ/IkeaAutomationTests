package org.homework.pages.catalogPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DinningRoomLightningPage {
    private final WebDriver driver;
    private By tableLampsLocator = By.xpath("//a[@href='/en/rooms/dining-room/dining-room-lighting/table-lamps']");

    public DinningRoomLightningPage(WebDriver driver) {
        this.driver = driver;
    }

    public TableLampsPage clickTableLampsImg() {
        driver.findElement(tableLampsLocator).click();
        return new TableLampsPage(driver);
    }
}
