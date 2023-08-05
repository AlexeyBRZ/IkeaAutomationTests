package org.homework.pages.catalogPages;

import org.homework.pages.commonPages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComfortToysPage {

    private final WebDriver driver;

    public ComfortToysPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage selectProduct(String productName) {
        WebElement product = driver.findElement(By.xpath("//h3[text()='" + productName + "']"));
        product.click();
        return new ProductPage(driver);
    }
}