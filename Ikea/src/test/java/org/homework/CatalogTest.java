package org.homework;

import org.homework.constants.Categories;
import org.homework.constants.Colors;
import org.homework.constants.ProductNames;
import org.homework.constants.Values;
import org.homework.pages.commonPages.HomePage;
import org.homework.pages.catalogPages.OutdoorsSofasPage;
import org.homework.pages.commonPages.ProductPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class CatalogTest extends BaseTest {

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
    void isProductAddedInCartModalWindow() {
        WebElement sideBoard = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickRoomsDropDown()
                .clickDiningRoomsBtn(Categories.DINNING_ROOM)
                .selectDiningTablesCategory()
                .selectProduct(ProductNames.NORDEN)
                .clickAddToShoppingCartBtn()
                .getProductInCartModalWindow(ProductNames.NORDEN);

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
                .selectCabinetsDisplayCabinetsCategory()
                .clickQuickViewBtn(ProductNames.SPIKSMED,0)
                .clickAddToShoppingCartFromQuickViewBtn()
                .clickGoToShoppingCartBtn()
                .removeProductFromCart(ProductNames.SPIKSMED)
                .isProductRemoved(ProductNames.SPIKSMED);

        Assertions.assertFalse(billy);
    }

    @Test
    //@Execution(ExecutionMode.CONCURRENT)
    void isMaterialsBlockDisplayed() {
        WebElement materialBtn = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickProductsTab()
                .selectSofasCategory(Categories.SOFAS)
                .selectProduct(ProductNames.SOFA_SLATORP)
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
    //@Execution(ExecutionMode.CONCURRENT)
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
                .clickNewCheckBox()
                .getSortByDropDown();

        Assertions.assertTrue(isStockCheckBox.isDisplayed());
    }

    @Test
  //  @Execution(ExecutionMode.CONCURRENT)
    void lastViewedProductOnHistoryPage() {
        WebElement lastViewedProduct = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickRoomsDropDown()
                .clickDiningRoomsBtn(Categories.DINNING_ROOM)
                .selectDiningRoomLightningCategory()
                .clickTableLampsImg()
                .selectProduct(ProductNames.LAMP_TOKABO)
                .getHeader()
                .clickIkeaLogo()
                .clickSeeMoreBtn()
                .getRecentlyViewedProduct(ProductNames.LAMP_TOKABO);

        Assertions.assertTrue(lastViewedProduct.isDisplayed());
    }

    @Test
    void errorIfInvalidEmailEntered() {
        WebElement incorrectEmailError = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickRoomsDropDown()
                .clickOfficeBtn(Categories.OFFICE)
                .selectDesksCategory()
                .selectHomeDesksCategory()
                .selectProduct(ProductNames.TORALD)
                .clickAddToFavouritesBtn()
                .getHeader()
                .clickFavoritesBtn()
                .enterInvalidEmail("invalidEmail")
                .clickCreateAccountBtn()
                .getErrorMessage();

        Assertions.assertTrue(incorrectEmailError.isDisplayed());
    }

    @Test
    void loginUserTest() {
        WebElement hejUserBtn = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickLoginOrRegisterBtn()
                .inputEmail("ganon82729@naymedia.com")
                .inputPassword("123456")
                .clickLoginBtn()
                .getHeyUserBtn();

        Assertions.assertTrue(hejUserBtn.isDisplayed());
    }

    @Test
 //   @Execution(ExecutionMode.CONCURRENT)
    void calculateDelivery() {
        WebElement toyImg = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickProductsTab()
                .selectSofasCategory(Categories.SOFAS)
                .selectProduct(ProductNames.SOFA_SLATORP)
                .clickCalculateNow()
                .getImgInDeliveryInf(ProductNames.SOFA_SLATORP);

        Assertions.assertTrue(toyImg.isDisplayed());
    }

    @Test
    void sortByPrice() {
        OutdoorsSofasPage outdoorsSofasPage = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickProductsTab()
                .selectOutDoorsSofasPage(Categories.OUTDOORS_SOFAS);

        Assertions.assertTrue(outdoorsSofasPage.getOutDoorsCushionsLink().isDisplayed());
        Assertions.assertTrue(outdoorsSofasPage.clickSortByDropDown().getFilterCategory(Categories.FILTER_BY_CATEGORY).isDisplayed());
    }

    @Test
  //  @Execution(ExecutionMode.CONCURRENT)
    void mustBeCompletedWithBox() {
        WebElement completedWithBox = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickProductsTab()
                .selectFloorLampsPage(Categories.FLOOR_LAMPS)
                .selectProduct(ProductNames.SVARTNORA)
                .selectSecondCompletedWithOption()
                .getCompletedWithItemImg();

        Assertions.assertTrue(completedWithBox.isDisplayed());
    }

    @Test
    void doProductImagesSwitch() {
        ProductPage switchedProductImg = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickRoomsDropDown()
                .clickDiningRoomsBtn(Categories.DINNING_ROOM)
                .selectCabinetsDisplayCabinetsCategory()
               // .selectDisplayCabinetsCategory()
                .selectProduct(ProductNames.DISPLAY_CABINET_FABRIKÖR);

        Assertions.assertNotEquals(switchedProductImg.getProductBigImg().getAttribute("href"),
                switchedProductImg.slideProductImage().getProductBigImg().getAttribute("href"));
    }

    @Test
  //  @Execution(ExecutionMode.CONCURRENT)
    void checkStockAvailability() {
        WebElement stockAvailabilityInfo = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickProductsTab()
                .selectGlassesCategory(Categories.GLASSES)
                .selectProduct(ProductNames.GLASS_PLANERA)
                .clickCheckStockInStoreBtn()
                .getAvailabilityInStockMessage();

        Assertions.assertTrue(stockAvailabilityInfo.isDisplayed());
    }
}