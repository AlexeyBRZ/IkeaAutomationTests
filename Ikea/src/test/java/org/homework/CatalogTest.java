package org.homework;

import org.homework.components.CartModalWindow;
import org.homework.homePage.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.homework.homePage.pages.CartPage;
import org.homework.components.Header;
import org.homework.components.RoomsTab;
import org.homework.catalogTesting.pages.DiningRoomPage;
import org.homework.catalogTesting.pages.SideBoards;

public class CatalogTest extends BaseTest{


    //Rooms
    //DiningRoom
    //SideBoards
    //IdaNas
    //clickOnImage
    //Add to shopping cart
    //Go to your shopping cart
    //check the item is added
    @Test
    void isItemCanBeAddedToCart(){
        WebElement sideBoard = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .getHeader()
                .switchToEnglish()
                .acceptAllCookiesBtn()
                .getHeader()
                .clickRoomsDropDown()
                .clickDiningRoomsBtn()
                .clickSideBoardsImg()
                .clickFjallboSideBoardImg()
                .clickAddToShoppingCartBtn()
                .getfjallboSideBoarditemIncart();

        boolean isFjalboSideBoarditemDisplayed = sideBoard.isDisplayed();
        Assertions.assertTrue(isFjalboSideBoarditemDisplayed);
    }
}
