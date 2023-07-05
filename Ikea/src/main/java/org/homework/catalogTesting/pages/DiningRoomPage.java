package org.homework.catalogTesting.pages;

import org.homework.components.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiningRoomPage {
    private WebDriver driver;

    public DiningRoomPage(WebDriver driver) {
        this.driver = driver;
    }
private By sideBoardsImgLocator = By.xpath("//span[@class=\"image\"]//img[@src=\"https://d2rbyiw1vv51io.cloudfront.net/web/ikea4/range/icons/1649840876_range.jpg\"]");

    public WebElement sideBoardsImg(){
        return driver.findElement(sideBoardsImgLocator);
    }

    public SideBoards clickSideBoardsImg(){
        sideBoardsImg().click();
        return new SideBoards(driver);
    }
}
