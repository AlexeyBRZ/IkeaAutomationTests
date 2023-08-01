package org.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsRoomPage {
    private WebDriver driver;

    public NewsRoomPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getWelcomeTitle() {
        return driver.findElement(By.xpath("//h1[contains(text(), \"Welcome!\")]"));
    }
}
