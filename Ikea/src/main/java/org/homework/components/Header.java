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

    public WebElement getLanguageSelector(){
        return driver.findElement(languageSelectorLocator);
    }

    public WebElement getSwitchToEnglishBtn(){
        return driver.findElement(switchToEnglishBtnLocator);
    }

    public WebElement getRoomsDropDown(){
        return driver.findElement(roomsDropDownLocator);
    }

    public HomePage switchToEnglish(){
        getLanguageSelector().click();
        getSwitchToEnglishBtn().click();
        return new HomePage(driver);
    }
    public RoomsTab clickRoomsDropDown(){
        getRoomsDropDown().click();
        return new RoomsTab(driver);
    }
    public ProductsTab clickProductsTab(){
        driver.findElement(By.xpath("//a[@id=\"navbarDropdownProducts\"]")).click();
        return new ProductsTab(driver);
    }

}
