package org.homework.pages.catalogPages;

import org.homework.pages.commonPages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SideBoardsPage {
    private final WebDriver driver;

    public SideBoardsPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage selectProduct(String productName) {
        driver.findElement(By.xpath("//h3[text()='" + productName + "']")).click();
        return new ProductPage(driver);
    }
}
