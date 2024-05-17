package org.homework.pages.catalogPages;

import org.homework.pages.commonPages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DiningRoomPage {
    private final WebDriver driver;
    private final By diningTablesLocator = By.xpath("//a[@href='/en/rooms/dining-room/dining-tables']");
    private final By diningRoomLightningLocator = By.xpath("//a[@href='/en/rooms/dining-room/dining-room-lighting']");
    private final By cabinetsAndDisplayCabinetsLocator = By.xpath("//a[@href='/en/rooms/dining-room/cabinets-display-cabinets']");

    public DiningRoomPage(WebDriver driver) {
        this.driver = driver;
    }

    public DiningTablesPage selectDiningTablesCategory() {
        driver.findElement(diningTablesLocator).click();
        return new DiningTablesPage(driver);
    }

  /*  public HomePage clickAcceptAllCookiesBtn() {
        WebElement getAcceptAllCookiesBtn = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(acceptAllCookiesBtnLocator));
        getAcceptAllCookiesBtn.click();
        return this;

   */
    public CabinetsDisplayCabinetsPage selectCabinetsDisplayCabinetsCategory() {
        WebElement getCabinetsAndDisplayCabinetsLocator = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(cabinetsAndDisplayCabinetsLocator));
        getCabinetsAndDisplayCabinetsLocator.click();
        return new CabinetsDisplayCabinetsPage(driver);
    }
    /*public CabinetsDisplayCabinetsPage selectCabinetsDisplayCabinetsCategory() {
        driver.findElement(cabinetsAndDisplayCabinetsLocator).click();
        return new CabinetsDisplayCabinetsPage(driver);
    }

     */

    public DinningRoomLightningPage selectDiningRoomLightningCategory() {
        driver.findElement(diningRoomLightningLocator).click();
        return new DinningRoomLightningPage(driver);
    }
}

