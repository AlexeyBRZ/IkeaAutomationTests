package org.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeMySelf {

    private WebDriver driver;

    public HomeMySelf(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHomeMySelfTitle(){
       return driver.findElement(By.xpath("//img[@alt='IKEA Latvija karjeras vietne']"));
    }
}
