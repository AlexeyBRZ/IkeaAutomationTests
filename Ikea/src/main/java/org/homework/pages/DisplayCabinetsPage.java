package org.homework.pages;

import org.homework.components.CartModalWindow;
import org.homework.products.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DisplayCabinetsPage {
    private final WebDriver driver;

    public DisplayCabinetsPage(WebDriver driver) {
        this.driver = driver;
    }

    public DisplayCabinetsPage clickQuickViewBtn(String productName, int position) {
        driver.findElements(By.xpath("//h3[text()='" + productName + "']//ancestor::div[@class=\"card-body\"]//following-sibling::div[@class=\"card-footer\"]//button")).get(position).click();
        return this;
    }

    public CartModalWindow clickAddToShoppingCartFromQuickViewBtn() {
        By addToShoppingCartFromQuickViewBtnLocator = By.xpath("//div[@id='sidenav']//button[@data-action='buy']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(addToShoppingCartFromQuickViewBtnLocator))
                .click();
        return new CartModalWindow(driver);
    }

    public ProductPage selectProduct(String productName) {
        driver.findElement(By.xpath("//h3[text()='" + productName + "']")).click();
        return new ProductPage(driver);
    }
}
