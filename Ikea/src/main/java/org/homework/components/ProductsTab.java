package org.homework.components;

import org.homework.pages.ComfortToysPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsTab {
    private WebDriver driver;
    public ProductsTab(WebDriver driver) {
        this.driver = driver;
    }

    //
    public ComfortToysPage clickComfortToys(String href){
        driver.findElement(By.xpath("//a[@href='/en/products/" + href + "']")).click();
        return new ComfortToysPage(driver);
    }
}
