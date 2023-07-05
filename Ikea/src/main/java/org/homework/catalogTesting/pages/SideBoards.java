package org.homework.catalogTesting.pages;

import org.homework.items.sideboards.FjallboSideBoardItem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SideBoards {
    private WebDriver driver;

    public SideBoards(WebDriver driver) {
        this.driver = driver;
    }



   // черновик "//a[@href=\"/en/rooms/dining-room/side-boards/side-boards/fjallbo-sideboard-black-art-00502799\"]//div[@class=\"productImg\"]"
    public By fjallboSideBoardImgLocator = By.xpath("//img[@src=\"https://d2rbyiw1vv51io.cloudfront.net/web/ikea4/images/291/1129167_PE891018_S3.jpg\"]");

    private WebElement fjallboSideBoardImg(){
        return driver.findElement(fjallboSideBoardImgLocator);
    }

    public FjallboSideBoardItem clickFjallboSideBoardImg(){
        fjallboSideBoardImg().click();
        return new FjallboSideBoardItem(driver);
    }

}
