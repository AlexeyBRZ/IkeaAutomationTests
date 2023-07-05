package org.homework.items.sideboards;

import org.homework.components.CartModalWindow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FjallboSideBoardItem {
    private WebDriver driver;
    public FjallboSideBoardItem(WebDriver driver) {
        this.driver = driver;
    }
    private By addToShoppingCartBtnLocator = By.xpath("//button[@data-action=\"buy\"]");
    private WebElement addToShoppingCartBtn(){
        return driver.findElement(addToShoppingCartBtnLocator);
    }

    public CartModalWindow clickAddToShoppingCartBtn(){
        addToShoppingCartBtn().click();
        return new CartModalWindow(driver);
    }

}
