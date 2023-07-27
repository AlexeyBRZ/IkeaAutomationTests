package org.homework.pages;

import org.homework.components.CartModalWindow;
import org.homework.products.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OfficeChairsPage {

    private WebDriver driver;
    public OfficeChairsPage(WebDriver driver) {
        this.driver = driver;
    }

    public OfficeChairsPage clickPriceDropDown(){
        driver.findElement(By.xpath("//div[@class='filterBlock']//div[text()=' Price']")).click();
        return this;
    }
    public OfficeChairsPage clickColorDropDown(){
        driver.findElement(By.xpath("//div[@id='colorFilter']")).click();
        return this;
    }

    public OfficeChairsPage pickFrom100To200CheckBox(){
        By from100To200CheckBoxLocator = By.xpath("//ul[@class='filterContent']//label[@for='From-100-€-to-200-€']");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(from100To200CheckBoxLocator))
                        .click();
        return this;
    }
    //input[@id='"+ color + "']
    //ul[@class='filterContent']//label[@for='black'] - рабочий
    //li[@data-color='#000000']//span[@data-class='icheckbox_minimal']
    //ul[@class='filterContent']//li[@data-color='#000000']//span[@data-class='icheckbox_minimal']

    public OfficeChairsPage pickColor(String color){
        driver.findElement(By.xpath("//ul[@class='filterContent']//li[@data-color='" + color + "']//span[@data-class='icheckbox_minimal']")).click();
        return this;

    }

    public OfficeChairsPage clickResetFilters(){
        driver.findElement(By.xpath("//a[@class='reset-filters']")).click();
        return this;
    }

    public WebElement getColorCheckbox(String color){
        return   driver.findElement(By.xpath(" //ul[@class='filterContent']//li[@data-color='" + color + "']//span[@data-class='icheckbox_minimal']"));
    }





}
