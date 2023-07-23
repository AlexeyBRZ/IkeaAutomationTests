package org.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.homework.pages.HomePage;
import org.openqa.selenium.WebElement;

/**
 * Unit test for simple App.
 */
public class HomePageTest extends BaseTest{

 //   private String ikeaUrl = "https://www.ikea.lv/en";

    @Test
    void isIkeaForBusinessArticleShown(){
        WebElement ikeaForBusinessTitle = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .getHeader()
                .switchToEnglish()
                .acceptAllCookiesBtn()
                .getIkeaForBusinessTitleLocator();

        boolean isIkeaForBusinessTitleDisplayed = ikeaForBusinessTitle.isDisplayed();
        Assertions.assertTrue(isIkeaForBusinessTitleDisplayed);

    }


    @Test
    void isIkeaForBusinessArticleShown2(){
        WebElement ikeaForBusinessTitle = new HomePage(getDriver())
                .navigateToIkeaHomePage()
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
