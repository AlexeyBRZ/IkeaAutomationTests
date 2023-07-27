package org.homework.components;

import org.homework.pages.HomePage;
import org.homework.pages.SearchResultsPage;
import org.homework.products.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {
    private WebDriver driver;
    public Header(WebDriver driver) {
        this.driver = driver;
    }
    private By languageSelectorLocator = By.xpath("//li[@class=\"nav-item dropdown\"]//a[@role=\"button\"]");
    private By switchToEnglishBtnLocator = By.xpath("//a[@href=\"https://www.ikea.lv/en\"]");
    private By roomsDropDownLocator = By.xpath("//a[@id=\"navbarDropdownRooms\"]");
    private By productsTabLocator = By.xpath("//a[@id=\"navbarDropdownProducts\"]");

    public HomePage switchLanguage(String language) {
        WebElement product = driver.findElement(By.xpath("//a[@href='https://www.ikea.lv/" + language + "']"));
        product.click();
        return new HomePage(driver);
    }

    public Header clickLanguageDropDown(){
        driver.findElement(languageSelectorLocator).click();
        return this;
    }

    public RoomsTab clickRoomsDropDown(){
        driver.findElement(roomsDropDownLocator).click();
        return new RoomsTab(driver);
    }
    public ProductsTab clickProductsTab(){
        driver.findElement(productsTabLocator).click();
        return new ProductsTab(driver);
    }

    public Header inputSearchField(String searchKey){
        driver.findElement(By.xpath("//div[@class='input-group']//input[@id='header_searcher_desktop_input']")).sendKeys(searchKey);
        return this;
    }

    public SearchResultsPage clickSearchBtn(){
        driver.findElement(By.xpath("//div[@class='input-group']//button[@class='btn searchIcon']"));
        return new SearchResultsPage(driver);
    }



}
