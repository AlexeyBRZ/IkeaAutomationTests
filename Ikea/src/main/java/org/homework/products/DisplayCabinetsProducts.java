package org.homework.products;

import org.homework.components.CartModalWindow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DisplayCabinetsProducts {

    private WebDriver driver;

    public DisplayCabinetsProducts(WebDriver driver) {
        this.driver = driver;
    }
//"00415603"
 public DisplayCabinetsProducts clickQuickViewBtn(String iTemNumber){
        driver.findElement(By.xpath("//button[@data-item=" + iTemNumber + "]"));
        return this;
 }

    private By addToShoppingCartBtnLocator = By.xpath("//button[@data-action=\"buy\"]");
    public CartModalWindow clickAddToShoppingCartBtn(){
        driver.findElement(By.xpath("//button[@data-action='buy']")).click();
        return new CartModalWindow(driver);
    }
}
