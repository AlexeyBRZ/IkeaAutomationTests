package org.homework.pages;

import org.homework.products.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SideBoardsPage {
    private WebDriver driver;

    public SideBoardsPage(WebDriver driver) {
        this.driver = driver;
    }

//    public ProductPage selectProduct(String href) {
//        WebElement product = driver.findElement(By.xpath("//div[@class='card-header']//a[@href='/en/rooms/dining-room/side-boards/side-boards/" + href + "']"));
//        product.click();
//        return new ProductPage(driver);

        public ProductPage selectProduct(String productName) {
            WebElement product = driver.findElement(By.xpath("//h3[text()='" + productName + "']"));
            product.click();
            return new ProductPage(driver);
        }
    }

//    public By fjallboSideBoardImgLocator = By.xpath("//img[@src=\"https://d2rbyiw1vv51io.cloudfront.net/web/ikea4/images/291/1129167_PE891018_S3.jpg\"]");
//
//    private WebElement fjallboSideBoardImg(){
//        return driver.findElement(fjallboSideBoardImgLocator);
//    }
//
//    public FjallboSideBoardItem clickFjallboSideBoardImg(){
//        fjallboSideBoardImg().click();
//        return new FjallboSideBoardItem(driver);
//    }
