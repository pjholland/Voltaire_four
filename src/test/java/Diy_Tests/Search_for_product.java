package Diy_Tests;

import com.paulh.pages.BasePage;
import com.paulh.pages.DiyHomePage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;


public class Search_for_product extends BasePage {

    @After

    public void ShutdownBrowser() {
        getDriver().close();
    }

    @Test
    public void Search_for_product_from_the_home_page() throws Exception {

        DiyHomePage home_page =  PageFactory.initElements(getDriver(), DiyHomePage.class);

        home_page.open();
        home_page.checkElementDisplayed(Locators.id, "sli_search_1");
        home_page.type(Locators.id, "sli_search_1", "Gardening");
        home_page.checkTextPresentOnPage("gardening");

    }

}
