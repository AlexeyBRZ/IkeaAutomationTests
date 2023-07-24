package org.homework.pages;

import org.homework.products.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DisplayCabinetsPage {
    private WebDriver driver;
    public DisplayCabinetsPage(WebDriver driver) {
        this.driver = driver;
    }
//div[@class="itemInfo"]//a[@href='/en/rooms/dining-room/display-cabinets/display-cabinets/billy-bookcase-with-glass-doors-grey-art-00415603']

    public ProductPage quickPreviewProduct(String href) {
       WebElement product = driver.findElement(By.xpath("//div[@class=\"itemInfo\"]//a[@href='/en/rooms/dining-room/display-cabinets/display-cabinets/" + href + "']"));
               product.click();
               return new ProductPage(driver);


    }

  //  private By billyLocator = By.xpath("//div[@class=\"itemInfo\"]//a[@href=\"/en/rooms/dining-room/display-cabinets/display-cabinets/billy-bookcase-with-glass-doors-grey-art-00415603\"]");

}
