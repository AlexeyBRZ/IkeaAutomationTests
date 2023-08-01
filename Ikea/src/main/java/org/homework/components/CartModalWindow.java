package org.homework.components;

import org.homework.pages.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class CartModalWindow {

    private final WebDriver driver;
    private boolean progressBarIsNotShown;

    public CartModalWindow(WebDriver driver) {
        this.driver = driver;
        boolean modalLoaded = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='modal-dialog modal-lg modal-dialog-lg']")))
                .isDisplayed();
        if (modalLoaded) {
            By progressBar = By.xpath("//div[@class='busy-load-container']//span[text()='Loading ...']");
            List<WebElement> elementList = driver.findElements(progressBar);
            progressBarIsNotShown = new WebDriverWait(driver, Duration.ofSeconds(15))
                    .until(ExpectedConditions.invisibilityOfAllElements(elementList));
        } else {
            throw new RuntimeException("Modal window is not loaded");
        }
    }

    public WebElement getProductInCartModalWindow(String productName) {
        By productInCartLocator = By.xpath("//div[@class='modal-content modal-buy']//div[@class='additems_list']//article[@class='item']//div[text()='" + productName + "']");
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(productInCartLocator));
    }

    public CartPage clickGoToShoppingCartBtn() {
        if (progressBarIsNotShown) {
            By goToCartBtnLocator = By.xpath("//div[@class='modal-content modal-buy']//button[@data-action='goCart']");
            new WebDriverWait(driver, Duration.ofSeconds(15))
                    .until(ExpectedConditions.elementToBeClickable(goToCartBtnLocator))
                    .click();
            return new CartPage(driver);
        } else {
            throw new RuntimeException("Progress bar is shown");
        }
    }
}


