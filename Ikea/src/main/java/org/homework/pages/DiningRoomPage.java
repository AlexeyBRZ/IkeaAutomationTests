package org.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DiningRoomPage {
    private WebDriver driver;

    public DiningRoomPage(WebDriver driver) {
        this.driver = driver;
    }

    private By sideBoardsImgLocator = By.xpath("//a[@href=\"/en/rooms/dining-room/side-boards\"]//span[@class='image']");
    private By displayCabinetsLocator = By.xpath("//a[@href='/en/rooms/dining-room/display-cabinets']");

    public SideBoardsPage clickSideBoardsImg(){
        driver.findElement(sideBoardsImgLocator).click();
        return new SideBoardsPage(driver);
    }

    public DisplayCabinetsPage clickDisplayCabinetsImg(){
       driver.findElement(displayCabinetsLocator).click();
       return new DisplayCabinetsPage(driver);
    }
}
