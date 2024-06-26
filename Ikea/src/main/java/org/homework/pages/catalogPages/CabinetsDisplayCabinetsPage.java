package org.homework.pages.catalogPages;

import org.homework.components.CartModalWindow;
import org.homework.pages.commonPages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CabinetsDisplayCabinetsPage {
    private final WebDriver driver;

    public CabinetsDisplayCabinetsPage(WebDriver driver) {
        this.driver = driver;
    }

    public CabinetsDisplayCabinetsPage clickQuickViewBtn(String productName, int position) {
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
