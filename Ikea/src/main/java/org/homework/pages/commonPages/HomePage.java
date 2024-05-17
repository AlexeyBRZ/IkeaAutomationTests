package org.homework.pages.commonPages;

import org.homework.components.Footer;
import org.homework.components.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private final WebDriver driver;
    private final By ikeaForBusinessTitleLocator = By.xpath("//li[@class='nav-item']//a[text()='IKEA for business']");
    private final By acceptAllCookiesBtnLocator = By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
    private final String ikeaUrl = "https://www.ikea.lv/en";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public Header getHeader() {
        return new Header(driver);
    }

    public Footer getFooter() {
        return new Footer(driver);
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

    public WebElement getShowAllBtn() {
        return driver.findElement(By.xpath("//a[text()='PAX wardrobe systems']//ancestor::div[@class='row']//a[@href='/en/page/pax']"));
    }

    public YourHistoryPage clickSeeMoreBtn() {
        driver.findElement(By.xpath("//div[@class='container d-print-none']//a[@href='/products/item_recently_viewed']")).click();
        return new YourHistoryPage(driver);
    }

    public WebElement getIkeaForFamilyBanner() {
        return driver.findElement(By.xpath("//h3[text()='IKEA Family offers for this month']"));
    }
}
