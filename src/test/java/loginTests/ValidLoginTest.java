package loginTests;

import baseTest.BaseTest;

import data.TestData;
import org.junit.Assert;
import org.junit.Test;



public class ValidLoginTest extends BaseTest {


    @Test
    public void validLogin() {
        pageProvider.loginPage().exeptCookie();
        pageProvider.loginPage().pressAccountButton();
        pageProvider.loginPage().clickOnClosePopupButton();
        pageProvider.loginPage().enterLogin(TestData.VALID_LOGIN);
        pageProvider.loginPage().enterPassword(TestData.VALID_PASSWORD);
        pageProvider.loginPage().clickOnButtonSingIn();


        Assert.assertFalse("User info is displayed after successful login", pageProvider.mainPage().getHeader().isUserInfoDisplayed());

    }


    @Test
    public void invalidLogin() {
        pageProvider.loginPage().exeptCookie();
        pageProvider.loginPage().pressAccountButton();
        pageProvider.loginPage().clickOnClosePopupButton();
        pageProvider.loginPage()
                .enterLogin("invalid_user@gmail.com")
                .enterPassword("invalid_password")
                .clickOnButtonSingIn();

        Assert.assertFalse("Button SignOut is visible", pageProvider.mainPage().getHeader().isButtonSignOutVisible());
        Assert.assertTrue("Button SignIn is visible", pageProvider.loginPage().isButtonSingInVisible());
        Assert.assertTrue("Alert Danger is not visible", pageProvider.loginPage().isInvalidLoginMessageDisplayed());


    }
}
