package org.homework.pages;

import org.homework.products.SideBoardsProducts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiningRoomPage {
    private WebDriver driver;

    public DiningRoomPage(WebDriver driver) {
        this.driver = driver;
    }
    //рабочий икспас //span[@class="image"]//img[contains(@src, "1649840876")]

    ////a[@href="/en/rooms/dining-room/side-boards"]//span[@class='image']
    ////span[@class="image"]//img[@src="https://d2rbyiw1vv51io.cloudfront.net/web/ikea4/range/icons/1649840876_range.jpg"]
    //*[ text() = ‘Get started free’ ]

    private By sideBoardsImgLocator = By.xpath("//a[@href=\"/en/rooms/dining-room/side-boards\"]//span[@class='image']");
    private By displayCabinetsLocator = By.xpath("//a[@href='/en/rooms/dining-room/display-cabinets']");
    public WebElement sideBoardsImg(){
        return driver.findElement(sideBoardsImgLocator);
    }

    public SideBoardsProducts clickSideBoardsImg(){
        sideBoardsImg().click();
        return new SideBoardsProducts(driver);
    }

    public DisplayCabinetsPage clickDisplayCabinetsImg(){
       driver.findElement(displayCabinetsLocator).click();
       return new DisplayCabinetsPage(driver);
    }
}
