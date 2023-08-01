package org.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeMySelf {

    private WebDriver driver;

    public HomeMySelf(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHomeMySelfTitle() {
        return driver.findElement(By.xpath("//div[@class='flex items-center mx-auto']//a[@href='https://ikealatvia.teamtailor.com/']"));
    }

    public HomeMySelf acceptCookies() {
        driver.findElement(By.xpath("//button[text()='Atļaut visas']")).click();
        return this;
    }
}