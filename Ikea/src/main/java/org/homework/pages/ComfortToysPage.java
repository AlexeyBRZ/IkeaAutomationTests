package org.homework.pages;

import org.homework.products.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComfortToysPage {

    private WebDriver driver;

    public ComfortToysPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage selectProduct(String href) {
        WebElement product = driver.findElement(By.xpath("//div[@class=\"itemInfo\"]//a[@href='/en/products/children-s-room/children-3-7/comfort-toys/" + href + "']"));
        product.click();
        return new ProductPage(driver);
    }
}
