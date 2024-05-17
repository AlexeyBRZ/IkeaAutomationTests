package org.homework.pages.commonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TheIkeaConceptPage {
    private WebDriver driver;

    public TheIkeaConceptPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getWelcomeTitle() {
        return driver.findElement(By.xpath("//h3[text()='Our values']"));
    }
}
