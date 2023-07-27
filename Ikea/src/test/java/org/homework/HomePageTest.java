package org.homework;

import org.homework.constants.Values;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.homework.pages.HomePage;
import org.openqa.selenium.WebElement;

/**
 * Unit test for simple App.
 */
public class HomePageTest extends BaseTest{

    @Test
    void isIkeaForBusinessArticleShown(){
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
    void isIkeaForBusinessArticleShown2(){
        WebElement ikeaForBusinessTitle = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickPaxWardrobeSystemsBlock()
//                .getHeader()
//                .switchToEnglish()
//                .acceptAllCookiesBtn()
                .getIkeaForBusinessTitleLocator();

        boolean isIkeaForBusinessTitleDisplayed = ikeaForBusinessTitle.isDisplayed();
        Assertions.assertTrue(isIkeaForBusinessTitleDisplayed);

    }
//    Example: //*[ contains (text(), ‘Get started’ ) ]
//    Example: //*[ text() = ‘Get started free’ ]
    //div[@class="mb-4 text-wrap"]//h3[@class="display-6"]//h3[text()= "IKEA for business"]

}
