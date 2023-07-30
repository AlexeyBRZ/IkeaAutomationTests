package org.homework.pages;

import org.homework.products.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.homework.products.ProductPage;

public class CupsAndMugsPage {

    private WebDriver driver;

    public CupsAndMugsPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage selectProduct(String productName) {
        WebElement product = driver.findElement(By.xpath("//h3[text()='" + productName + "']"));
        product.click();
        return new ProductPage(driver);
    }
}
