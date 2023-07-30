package org.homework;

import org.homework.constants.Values;
import org.homework.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class HomePageTest extends BaseTest {

    @Test
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
        WebElement nextBtn = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickPaxWardrobeSystemsBlock() // тоже не работает
                .getNextBtn();

        Assertions.assertTrue(nextBtn.isDisplayed());
    }

    @Test
    void areBannersOnHomePageDisplayed() {
        WebElement ikeaLifeBanner = new HomePage((getDriver()))
                .navigateToIkeaHomePage()
                .clickLearnMoreInTogetherBanner()// не работает
                .getHomeMySelfTitle();

        Assertions.assertEquals("https://ikealatvia.teamtailor.com/", driver.getCurrentUrl());
        Assertions.assertTrue(ikeaLifeBanner.isDisplayed());
    }
}
