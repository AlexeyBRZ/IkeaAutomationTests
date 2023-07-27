package org.homework.products;

import org.homework.components.CartModalWindow;
import org.homework.components.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public Header getHeader() {
        return new Header(driver);
    }


////div[contains(@class, 'itemBlock')]//div[@class='card-body']//h3[text()='HAUGA']
// public ProductPage clickQuickViewBtn(String iTemNumber, int position){
//        driver.findElements(By.xpath("//button[@data-item=" + iTemNumber + "]")).get(position).click();
//        return this;
// }

    public CartModalWindow clickAddToShoppingCartBtn(){
        driver.findElement(By.xpath("//button[@data-action='buy']")).click();
        return new CartModalWindow(driver);
    }

      public WebElement getMaterialsBlockBtn() {
        return driver.findElement(By.xpath("//a[@id=\"pills-environment-tab\"]"));
    }


}
