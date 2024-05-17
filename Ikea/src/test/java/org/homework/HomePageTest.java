package org.homework;

import org.homework.constants.Values;
import org.homework.pages.commonPages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class HomePageTest extends BaseTest {

    @Test
   // @Execution(ExecutionMode.CONCURRENT)
    void isIkeaForBusinessArticleShown() {
        WebElement ikeaForBusinessTitle = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .getHeader()
                .clickLanguageDropDown()
                .switchLanguage(Values.ENGLISH)
                .getIkeaForBusinessTitleLocator();

        boolean isIkeaForBusinessTitleDisplayed = ikeaForBusinessTitle.isDisplayed();
        Assertions.assertTrue(isIkeaForBusinessTitleDisplayed);
    }

    @Test
    void isShawAllBtnEnabled() {
        WebElement showAll = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .clickPaxWardrobeSystemsBlock()
                .getShowAllBtn();

        Assertions.assertTrue(showAll.isEnabled());
    }

    @Test
   // @Execution(ExecutionMode.CONCURRENT)
    void isIkeaForFamilyBannerDisplayed() {
        WebElement ikeaLifeBanner = new HomePage((getDriver()))
                .navigateToIkeaHomePage()
                .getHeader()
                .clickLanguageDropDown()
                .switchLanguage(Values.ENGLISH)
                .clickAcceptAllCookiesBtn()
                .getIkeaForFamilyBanner();

        Assertions.assertTrue(ikeaLifeBanner.isDisplayed());
    }
}
