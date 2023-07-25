package org.homework.pages;
import org.homework.components.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public Header getHeader() {
        return new Header(driver);
    }

    private By ikeaForBusinessTitleLocator = By.xpath("//div[@class=\"mb-4 text-wrap\"]//h3[text()= \"IKEA for business\"]");
    private By acceptAllCookiesBtnLocator = By.xpath("//div[@id=\"CybotCookiebotDialogBodyButtons\"]//button[text()=\"Accept all cookies\"]");

    private String ikeaUrl = "https://www.ikea.lv/en";

    public HomePage navigateToIkeaHomePage() {
        driver.get(ikeaUrl);
        return this;
    }

    public WebElement getIkeaForBusinessTitleLocator() {
        return driver.findElement(ikeaForBusinessTitleLocator);
    }

   public HomePage acceptAllCookiesBtn () {
       WebElement getAcceptAllCookiesBtn = new WebDriverWait(driver, Duration.ofSeconds(15))
                       .until(ExpectedConditions.elementToBeClickable(acceptAllCookiesBtnLocator));
       getAcceptAllCookiesBtn.click();
       return this;
   }

   public HomePage clickPaxWardrobeSystemsBlock(){
        driver.findElement(By.xpath("#traffic_group_118_96")).click();
        return this;
   }


}
