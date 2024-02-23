package favoritesTest;

import baseTest.BaseTest;
import data.TestData;
import org.junit.Assert;
import org.junit.Test;
import pages.FavoritesPage;

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
        pageProvider.favoritePage().checkCountOfFavorites();

        Assert.assertTrue("Favorites count is not as expected", pageProvider.favoritePage().checkCountOfFavorites());
        Assert.assertFalse("No favorites found", pageProvider.favoritePage().checkCountOfFavorites());





    }


}
