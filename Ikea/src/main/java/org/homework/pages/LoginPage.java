package org.homework.pages;

import org.homework.components.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage enterInvalidEmail(String value) {
        driver.findElement(By.xpath("//input[@id='loginForm_emailCreate']"))
                .sendKeys(value);
        return this;
    }

    public LoginPage clickCreateAccountBtn() {
        driver.findElement(By.xpath("//button[@id='loginForm_createAccount']")).click();
        return this;
    }

    public WebElement getErrorMessage() {
        By errorMessageLocator = By.xpath("//form[@class='form_create-form']//p[text()='The email is incorrect']");
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(errorMessageLocator));
    }

    public LoginPage inputEmail(String email) {
        driver.findElement(By.xpath("//form[@class='form_login-form']//input[@type='email']")).sendKeys(email);
        return this;
    }

    public LoginPage inputPassword(String password) {
        driver.findElement(By.xpath("//form[@class='form_login-form']//input[@type='password']")).sendKeys(password);
        return this;
    }

    public Header clickLoginBtn() {
        driver.findElement(By.xpath("//button[@id='btnSubmitLogin']")).click();
        return new Header(driver);
    }
}
