package org.homework.products;

import org.homework.components.CartModalWindow;
import org.homework.components.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    private final WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public Header getHeader() {
        return new Header(driver);
    }

    public CartModalWindow clickAddToShoppingCartBtn() {
        driver.findElement(By.xpath("//button[@data-action='buy']")).click();
        return new CartModalWindow(driver);
    }

    public WebElement getMaterialsBlockBtn() {
        return driver.findElement(By.xpath("//a[@id=\"pills-environment-tab\"]"));
    }

    public ProductPage clickAddToFavouritesBtn() {
        driver.findElement(By.xpath("//button[@data-action='favorites']")).click();
        return this;
    }

    public ProductPage clickCalculateNow() {
        driver.findElement(By.xpath("//small[text()='Calculate now']")).click();
        return this;
    }

    public WebElement getImgInDeliveryInf(String productName) {
        By imgInDeliveryInfLocator = By.xpath("//div[@class='card-body']//b[text()='" + productName + "']");
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(imgInDeliveryInfLocator));
    }

    public ProductPage selectSecondCompletedWithOption() {
        driver.findElement(By.xpath("//button[@aria-label='2 of 3']")).click();
        return this;
    }

    public WebElement getCompletedWithItemImg() {
        return driver.findElement(By.xpath("//div[@id='slick-slide01']//div[@class='productImg']"));
    }

    public ProductPage slideProductImage() {
        driver.findElement(By.xpath("//div[@data-slider='slide']//button[@class='slick-next slick-arrow']")).click();
        return this;
    }

    public WebElement getProductBigImg() {
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(
                        "//div[@class='col-sm-12 col-md-10 col-lg-10 col slides']//div[@aria-hidden='false']//a")));
    }

    public ProductPage clickCheckStockInStoreBtn() {
        driver.findElement(By.xpath("//a[contains(text(), 'Check stock in store')]")).click();
        return this;
    }

    public WebElement getAvailabilityInStockMessage() {
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(
                        "//div[@class='card-body']//div[@class='message noCursor d-flex']")));
    }
}