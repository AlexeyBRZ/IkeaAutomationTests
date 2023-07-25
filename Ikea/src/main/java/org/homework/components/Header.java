package org.homework.components;

import org.homework.pages.HomePage;
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

    public HomePage switchToEnglish(){
        driver.findElement(languageSelectorLocator).click();
        driver.findElement(switchToEnglishBtnLocator).click();
        return new HomePage(driver);
    }
    public RoomsTab clickRoomsDropDown(){
        driver.findElement(roomsDropDownLocator).click();
        return new RoomsTab(driver);
    }
    public ProductsTab clickProductsTab(){
        driver.findElement(productsTabLocator).click();
        return new ProductsTab(driver);
    }

}
