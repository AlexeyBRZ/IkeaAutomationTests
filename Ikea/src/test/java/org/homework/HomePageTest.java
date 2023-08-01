package org.homework;

import org.homework.constants.Values;
import org.homework.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.WebElement;

public class HomePageTest extends BaseTest {

    @Test
    @Execution(ExecutionMode.CONCURRENT)
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
    void isPaxWardrobeSystemBlockScrollable() {
        WebElement showAll = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .clickPaxWardrobeSystemsBlock()
                .getShowAllBtn();

        Assertions.assertTrue(showAll.isEnabled());
    }

    @Test
    @Execution(ExecutionMode.CONCURRENT)
    void areBannersOnHomePageDisplayed() {
        WebElement ikeaLifeBanner = new HomePage((getDriver()))
                .navigateToIkeaHomePage()
                .getHeader()
                .clickLanguageDropDown()
                .switchLanguage(Values.ENGLISH)
                .clickAcceptAllCookiesBtn()
                .getLearnMoreInTogetherBanner();

        Assertions.assertTrue(ikeaLifeBanner.isDisplayed());
    }
}
