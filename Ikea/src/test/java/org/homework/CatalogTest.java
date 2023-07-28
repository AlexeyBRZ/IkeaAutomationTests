package org.homework;

import org.homework.constants.Categories;
import org.homework.constants.Colors;
import org.homework.constants.ProductNames;
import org.homework.constants.Values;
import org.homework.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class CatalogTest extends BaseTest implements ProductNames, Categories, Values {

    @Test
    void changeLanguageAndCookiesAcceptance() {
        new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .getHeader()
                .clickLanguageDropDown()
                .switchLanguage(Values.LATVIAN)
                .clickAcceptAllCookiesBtn();
        Assertions.assertEquals("https://www.ikea.lv/" + Values.LATVIAN, driver.getCurrentUrl());
    }

    @Test
    void canItemBeAddedToCart() {
        WebElement sideBoard = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickRoomsDropDown()
                .clickDiningRoomsBtn(Categories.DINNING_ROOM)
                .clickSideBoardsImg()
                .selectProduct(ProductNames.FJALLBO)
                .clickAddToShoppingCartBtn()
                .getProductInCartModalWindow(ProductNames.FJALLBO);

        Assertions.assertTrue(sideBoard.isDisplayed());
    }

    @Test
    void canProductBeRemovedFromCart() {
        boolean billy = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickRoomsDropDown()
                .clickDiningRoomsBtn(Categories.DINNING_ROOM)
                .clickDisplayCabinetsImg()
                .clickQuickViewBtn(ProductNames.BILLY, 0)
                .clickAddToShoppingCartFromQuickViewBtn()
                .clickGoToShoppingCartBtn()
                .removeProductFromCart() // не работает этот метод, не понимаю почему? получаю "java.lang.IllegalArgumentException: Input must be set"
                .isProductRemoved();
        Assertions.assertFalse(billy);
    }

    @Test
    void isMaterialsBlockClickable() {
        WebElement materialBtn = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickProductsTab()
                .selectComfortToysCategory(Categories.COMFORT_TOYS)
                .selectProduct(ProductNames.GREY_RAT)
                .getMaterialsBlockBtn();

        Assertions.assertTrue(materialBtn.isDisplayed());
    }

    @Test
    void chairsFilter() {
        WebElement colorCheckbox = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickProductsTab()
                .selectOfficeChairsCategory(Categories.OFFICE_CHAIRS)
                .clickPriceDropDown()
                .pickFrom100To200CheckBox()
                .clickColorDropDown()
                .pickColor(Colors.BLACK_COLOR)
                .clickColorDropDown()
                .clickResetFilters()
                .clickColorDropDown()
                .getColorCheckbox(Colors.BLACK_COLOR);
        Assertions.assertFalse(colorCheckbox.isSelected());
    }

    @Test
    void searchFromPages() {
        WebElement isStockCheckBox = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickProductsTab()
                .selectGlassesCategory(Categories.GLASSES)
                .selectProduct(ProductNames.SVALKA)
                .getHeader()
                .inputSearchField("Bed")
                .clickSearchBtn()
                .clickCurrentlyInStockCheckBox()
                //           .clickNewCheckBox() // не понимаю почему не прожимается этот чекбокс, все остальное работает
                .getSortByDropDown();
        Assertions.assertTrue(isStockCheckBox.isDisplayed());
    }
}

