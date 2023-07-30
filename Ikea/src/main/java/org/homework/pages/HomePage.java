package org.homework.pages;

import org.homework.components.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private final WebDriver driver;
    private final By ikeaForBusinessTitleLocator = By.xpath("//div[@class='container-fluid homepage']//h3[text()='IKEA for business']");
    private final By acceptAllCookiesBtnLocator = By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
    private final String ikeaUrl = "https://www.ikea.lv/en";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public Header getHeader() {
        return new Header(driver);
    }

    public HomePage navigateToIkeaHomePage() {
        driver.get(ikeaUrl);
        return this;
    }

    public WebElement getIkeaForBusinessTitleLocator() {
        return driver.findElement(ikeaForBusinessTitleLocator);
    }

    public HomePage clickAcceptAllCookiesBtn() {
        WebElement getAcceptAllCookiesBtn = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(acceptAllCookiesBtnLocator));
        getAcceptAllCookiesBtn.click();
        return this;
    }

    public HomePage clickPaxWardrobeSystemsBlock() {
        By paxWardrobeSystemsBlockLocator = By.xpath("//div[@class='container']//nav[@role='tablist']//a[text()='PAX wardrobe systems']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(paxWardrobeSystemsBlockLocator))
                .click();
        return this;
    }

    public WebElement getNextBtn() {
        return driver.findElement(By.xpath("//a[text()='PAX wardrobe systems']//ancestor::div[@class='row']//button[@aria-label=\"Next\"]"));
    }

    public YourHistoryPage clickSeeMoreBtn() {
         driver.findElement(By.xpath("//div[@class='container d-print-none']//a[@href='/products/item_recently_viewed']")).click();
        return new YourHistoryPage(driver);
    }

    public HomeMySelf clickLearnMoreInTogetherBanner(){
       driver.findElement(By.xpath("//h3[text()='Together we get things done']//parent::div[@class='mb-4 text-wrap']//b")).click();
       return new HomeMySelf(driver);
    }
}
