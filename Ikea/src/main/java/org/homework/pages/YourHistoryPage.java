package org.homework.pages;

import org.homework.products.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourHistoryPage {
    private WebDriver driver;

    public YourHistoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getRecentlyViewedProduct (String productName) {
       return driver.findElement(By.xpath("//h3[text()='" + productName + "']"));
    }
}
