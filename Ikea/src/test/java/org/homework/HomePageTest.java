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
    void isIkeaForBusinessArticleShown2() {
        WebElement nextBtn = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickPaxWardrobeSystemsBlock()
                .getNextBtn();

        Assertions.assertTrue(nextBtn.isDisplayed());
    }
}
