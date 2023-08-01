package org.homework.pages;

import org.homework.products.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CupsAndMugsPage {

    private WebDriver driver;

    public CupsAndMugsPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage selectProduct(String productName) {
        driver.findElement(By.xpath("//h3[text()='" + productName + "']")).click();
        return new ProductPage(driver);
    }
}
