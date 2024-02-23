package basketTests;

import baseTest.BaseTest;
import data.TestData;
import org.junit.Assert;
import org.junit.Test;

public class AddToBasketTest extends BaseTest {

    @Test
    public void addToBasket() {
        pageProvider.loginPage().exeptCookie();
        pageProvider.loginPage().pressAccountButton();
        pageProvider.loginPage().clickOnClosePopupButton();
        pageProvider.loginPage().enterLogin(TestData.VALID_LOGIN);
        pageProvider.loginPage().enterPassword(TestData.VALID_PASSWORD);
        pageProvider.loginPage().clickOnButtonSingIn();
        pageProvider.loginPage().clickOnClosePopupButton();
        pageProvider.loginPage().clickOnItemPage();
        pageProvider.itemsPage().clickOnAddToBasketButton();
        pageProvider.itemsPage().clickOnChoseSize();
        pageProvider.itemsPage().clickOnCloseAddedWindow();
        pageProvider.mainPage().getHeader().clickOnButtonBasket();


        Assert.assertFalse("Item was added to the basket", pageProvider.basketPage().isBasketContainsItems());



    }
}