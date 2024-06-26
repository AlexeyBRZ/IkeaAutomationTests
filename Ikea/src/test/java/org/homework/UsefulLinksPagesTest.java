package org.homework;

import org.homework.constants.Articles;
import org.homework.constants.Values;
import org.homework.pages.commonPages.HomePage;
import org.homework.pages.commonPages.TermsAndConditionsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class UsefulLinksPagesTest extends BaseTest {

    @Test
    //@Execution(ExecutionMode.CONCURRENT)
    void isWelcomeTitleDisplayed() {
        WebElement welcomeTitle = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getFooter()
                .clickAboutIkeaInFooter(Values.FOOTER_ABOUT_IKEA_LINK)
                .clickTheIkeaConceptBtn(Values.THE_IKEA_CONCEPT_BTN)
                .getWelcomeTitle();

        Assertions.assertTrue(welcomeTitle.isDisplayed());
    }

    @Test
   // @Execution(ExecutionMode.CONCURRENT)
    void checkContactEmail() {
        WebElement contactUsArticle = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getHeader()
                .clickContactsBtn()
                .getContactEmail();

        Assertions.assertEquals("info@IKEA.lv", contactUsArticle.getText());
    }

    @Test
    //@Execution(ExecutionMode.CONCURRENT)
    void termsAndConditionsArticles() {
        TermsAndConditionsPage termAndCond = new HomePage(getDriver())
                .navigateToIkeaHomePage()
                .clickAcceptAllCookiesBtn()
                .getFooter()
                .clickTermAndCondInFooter(Values.FOOTER_TERM_AND_COND);

        Assertions.assertTrue(termAndCond.isArticleDisplayed(Articles.T_AND_C_ARTICLE_DEFINITIONS));
        Assertions.assertTrue(termAndCond.isArticleDisplayed(Articles.T_AND_C_ARTICLE_ENTERING_INTO_THE_PURCHASE_AND_SALE_AGREEMENT));
        Assertions.assertTrue(termAndCond.isArticleDisplayed(Articles.T_AND_C_ARTICLE_GENERAL_PROVISIONS));
        Assertions.assertTrue(termAndCond.isArticleDisplayed(Articles.T_AND_C_ARTICLE_PROVISION_OF_INFORMATION));
        Assertions.assertTrue(termAndCond.isArticleDisplayed(Articles.T_AND_C_ARTICLE_RIGHTS_AND_OBLIGATIONS_OF_THE_SELLER));
    }
}
