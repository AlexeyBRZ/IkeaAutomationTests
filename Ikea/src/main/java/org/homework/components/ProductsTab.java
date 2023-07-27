package org.homework.components;

import org.homework.pages.ComfortToysPage;
import org.homework.pages.GlassesPage;
import org.homework.pages.OfficeChairsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsTab {
    private WebDriver driver;
    public ProductsTab(WebDriver driver) {
        this.driver = driver;
    }

    public ComfortToysPage selectComfortCategory(String category){
        driver.findElement(By.xpath("//a[@href='/en/products/" + category + "']")).click();
        return new ComfortToysPage(driver);
    }

    public OfficeChairsPage selectOfficeChairsCategory(String category){
        driver.findElement(By.xpath("//a[@href='/en/products/" + category + "']")).click();
        return new OfficeChairsPage(driver);
    }

    public GlassesPage selectGlassesCategory(String category){
        driver.findElement(By.xpath("//a[@href='/en/products/" + category + "']")).click();
        return new GlassesPage(driver);
    }
}
