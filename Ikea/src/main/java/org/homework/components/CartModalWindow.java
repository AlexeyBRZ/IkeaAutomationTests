package org.homework.components;

import org.homework.catalogTesting.pages.SideBoards;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.homework.catalogTesting.pages.SideBoards;
import org.openqa.selenium.WebElement;


public class CartModalWindow {
    private WebDriver driver;
    public CartModalWindow(WebDriver driver) {
        this.driver = driver;
    }

    private By fjallboSideBoarditemIncartLocator = By.xpath("//div[@class=\"modal-content modal-buy\"]//div[@class=\"additems_list\"]//img[@src=\"https://d2rbyiw1vv51io.cloudfront.net/web/ikea4/images/291/1129167_PE891018_S3.jpg\"]");
    public WebElement getfjallboSideBoarditemIncart(){
        return driver.findElement(fjallboSideBoarditemIncartLocator);
    }
}

