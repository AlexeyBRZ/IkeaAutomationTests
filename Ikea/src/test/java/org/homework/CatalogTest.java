package org.homework;

import org.homework.constants.Categories;
import org.homework.constants.Colors;
import org.homework.constants.Values;
import org.homework.constants.ProductNames;
import org.homework.pages.HomePage;
import org.homework.pages.OfficeChairsPage;
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
                .clickDiningRoomsBtn()
                .clickSideBoardsImg()
                .selectProduct(ProductNames.FJALLBO)
                .clickAddToShoppingCartBtn()
                .productInCartModalWindow(ProductNames.FJALLBO);

        Assertions.assertTrue(sideBoard.isDisplayed());
    }

    @Test
    void canProductBeRemovedFromCart() {
        boolean Billy = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickRoomsDropDown()
                .clickDiningRoomsBtn()
                .clickDisplayCabinetsImg()
                .clickQuickViewBtn(ProductNames.BILLY, 0)
                .clickAddToShoppingCartFromQuickViewBtn()
                .clickGoToShoppingCartBtn()
                .removeProductFromCart() // не работает этот метод, не понимаю почему? получаю "java.lang.IllegalArgumentException: Input must be set"
                .isProductRemoved();
        Assertions.assertFalse(Billy);
    }

    @Test
    void isMaterialsBlockClickable() {
        WebElement materialBtn = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickProductsTab()
                .selectComfortCategory(Categories.COMFORT_TOYS)//меняется хреф, пока создал 2 разных в интерфейсе. Как обойти?
                .selectProduct(ProductNames.GREY_RAT)
                .getMaterialsBlockBtn();

        Assertions.assertTrue(materialBtn.isDisplayed());
    }

    @Test
    void ChairsFilter() {
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

    @Test //пока не работает, есть подозрения что проблема просто в икспасе
    void SearchFromPages() {
        WebElement inStockCheckBox = new HomePage(getDriver())
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
                .clickNewCheckBox()
                .getSortByDropDown();
        Assertions.assertTrue(inStockCheckBox.isDisplayed());
    }
}

