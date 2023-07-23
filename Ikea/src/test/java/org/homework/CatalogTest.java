package org.homework;

import org.homework.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class CatalogTest extends BaseTest {


    //Rooms
    //DiningRoom
    //SideBoards
    //IdaNas
    //clickOnImage
    //Add to shopping cart
    //Go to your shopping cart
    //check the item is added
    @Test
    void canItemBeAddedToCart() {
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

    @Test
    void canProductBeRemovedFromCart() {
        String uniqProductHref = "billy-bookcase-with-glass-doors-grey-art-00415603";
        String itemNumber = "00415603";
        boolean Billy = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .acceptAllCookiesBtn()
                .getHeader()
                .clickRoomsDropDown()
                .clickDiningRoomsBtn()
                .clickDisplayCabinetsImg()
                .selectProduct(uniqProductHref)
                .clickQuickViewBtn(itemNumber)
                .clickAddToShoppingCartBtn()
                .clickGoToShoppingCartBtn()
                .removeFromCart(itemNumber)
                .isProductRemoved(itemNumber);
        Assertions.assertFalse(Billy);
    }

//    @Test
//    void test() {
//        String testString = "000123456789";
//
//        System.out.println(removeZero(testString));
//    }


    }

