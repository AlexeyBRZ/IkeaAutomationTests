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
        String productHref = "fjallbo-sideboard-black-art-00502799";
        String itemId = "502799";
        WebElement sideBoard = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .getHeader()
                .switchToEnglish()
                .acceptAllCookiesBtn()
                .getHeader()
                .clickRoomsDropDown()
                .clickDiningRoomsBtn()
                .clickSideBoardsImg()
                .selectProduct(productHref)
                .clickAddToShoppingCartBtn()
                .productInCartModalWindow(itemId);

        Assertions.assertTrue(sideBoard.isDisplayed());
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
                .quickPreviewProduct(uniqProductHref)
                .clickQuickViewBtn(itemNumber)
                .clickAddToShoppingCartBtn()
                .clickGoToShoppingCartBtn()
                .removeFromCart() // не работает этот метод, буду разбираться
                .isProductRemoved(itemNumber);
        Assertions.assertFalse(Billy);
    }

    @Test
    void isMaterialsBlockClickable() {
        String categoryHref = "children-s-room/children-3-7/comfort-toys";
        String productHref = "gosig-ratta-soft-toy-grey-beige-art-90490476";
        WebElement materialBtn = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .acceptAllCookiesBtn()
                .getHeader()
                .clickProductsTab()
                .selectCategory(categoryHref)
                .selectProduct(productHref)
                .getMaterialsBlockBtn();

        Assertions.assertTrue(materialBtn.isDisplayed());
    }
    }

