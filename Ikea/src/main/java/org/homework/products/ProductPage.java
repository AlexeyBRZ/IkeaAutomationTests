package org.homework.products;

import org.homework.components.CartModalWindow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

 public ProductPage clickQuickViewBtn(String iTemNumber){
        driver.findElement(By.xpath("//button[@data-item=" + iTemNumber + "]"));
        return this;
 }

    public CartModalWindow clickAddToShoppingCartBtn(){
        driver.findElement(By.xpath("//button[@data-action='buy']")).click();
        return new CartModalWindow(driver);
    }

      public WebElement getMaterialsBlockBtn() {
        return driver.findElement(By.xpath("//a[@id=\"pills-environment-tab\"]"));
    }
}
