package org.homework.components;

import org.homework.pages.HomePage;
import org.homework.pages.LoginPage;
import org.homework.pages.SearchResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Header {
    private final WebDriver driver;
    private final By languageSelectorLocator = By.xpath("//li[@class=\"nav-item dropdown\"]//a[@role=\"button\"]");
    private final By roomsDropDownLocator = By.xpath("//a[@id=\"navbarDropdownRooms\"]");
    private final By productsTabLocator = By.xpath("//a[@id=\"navbarDropdownProducts\"]");

    public Header(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage switchLanguage(String language) {
        By switchLanguageLocator = By.xpath("//a[@href='https://www.ikea.lv/" + language + "']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(switchLanguageLocator))
                .click();
        return new HomePage(driver);
    }

    public Header clickLanguageDropDown() {
        driver.findElement(languageSelectorLocator).click();
        return this;
    }

    public RoomsTab clickRoomsDropDown() {
        driver.findElement(roomsDropDownLocator).click();
        return new RoomsTab(driver);
    }

    public ProductsTab clickProductsTab() {
        driver.findElement(productsTabLocator).click();
        return new ProductsTab(driver);
    }

    public Header inputSearchField(String searchKey) {
        driver.findElement(By.xpath("//div[@class='input-group']//input[@id='header_searcher_desktop_input']")).sendKeys(searchKey);
        return this;
    }

    public SearchResultsPage clickSearchBtn() {
        driver.findElement(By.xpath("//div[@class='input-group']//button[@class='btn searchIcon']")).click();
        return new SearchResultsPage(driver);
    }

    public HomePage clickIkeaLogo() {
        driver.findElement(By.xpath("//div[@class='container headerMenuProducts']//img[@alt='IKEA']")).click();
        return new HomePage(driver);
    }

    public LoginPage clickFavoritesBtn() {
        driver.findElement(By.xpath("//div[@class='container headerMenuProducts']" +
                "//a[@href='/en/client/account/favourites']//span[@class='icon icon-fav']")).click();
        return new LoginPage(driver);
    }

    public LoginPage clickLoginOrRegisterBtn() {
        driver.findElement(By.xpath("//a[@href='/en/client']")).click();
        return new LoginPage(driver);
    }

    public WebElement getHeyUserBtn() {
      WebElement hejUserbtn = new WebDriverWait(driver,Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Hej')]")));
       return hejUserbtn;
    }
}
