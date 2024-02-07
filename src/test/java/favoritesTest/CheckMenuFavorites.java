package favoritesTest;

import baseTest.BaseTest;
import data.TestData;
import org.junit.Test;

public class CheckMenuFavorites extends BaseTest {

    @Test
    public void checkMenuFavorites() {
        pageProvider.loginPage().exeptCookie();
        pageProvider.loginPage().pressAccountButton();
        pageProvider.loginPage().clickOnClosePopupButton();
        pageProvider.loginPage().enterLogin(TestData.VALID_LOGIN);
        pageProvider.loginPage().enterPassword(TestData.VALID_PASSWORD);
        pageProvider.loginPage().clickOnButtonSingIn();
        pageProvider.loginPage().clickOnClosePopupButton();
        pageProvider.mainPage().getHeader().clickOnButtonFavorite();
        pageProvider.favoritePage().getCountOfFavorites();




    }


}
