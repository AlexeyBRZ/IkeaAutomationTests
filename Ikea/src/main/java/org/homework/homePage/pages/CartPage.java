package org.homework.homePage.pages;

import org.homework.components.Header;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    public Header getHeader() {
        return new Header(driver);
    }
}
