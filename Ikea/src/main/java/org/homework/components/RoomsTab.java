package org.homework.components;

import org.homework.pages.ComfortToysPage;
import org.homework.pages.DiningRoomPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RoomsTab {
    private WebDriver driver;
    public RoomsTab(WebDriver driver) {
        this.driver = driver;
    }
    private By diningRoomBtnLocator = By.xpath("//a[@href=\"/en/rooms/dining-room\"]");

    public WebElement getDiningRoomsBtn(){
        return driver.findElement(diningRoomBtnLocator);
    }

//    public DiningRoomPage selectCategoryInRoomsTab(String category){
//        driver.findElement(By.xpath("//a[@href='/en/rooms/" + category + "']")).click();
//        return new DiningRoomPage(driver);
//    }

    public DiningRoomPage clickDiningRoomsBtn(){
        getDiningRoomsBtn().click();
        return new DiningRoomPage(driver);
    }

}
