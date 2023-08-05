package org.homework.pages.commonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactsPage {

    private WebDriver driver;

    public ContactsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getContactEmail() {
        return driver.findElement(By.xpath("//a[@href='mailto:info@IKEA.lv']"));
    }
}
