package loginTests;

import baseTest.BaseTest;
import data.TestData;
import org.junit.Test;

public class SingOutTest extends BaseTest {
    @Test
    public void singOut(){

        pageProvider.loginPage().exeptCookie();
        pageProvider.loginPage().pressAccountButton();
        pageProvider.loginPage().clickOnClosePopupButton();
        pageProvider.loginPage().enterLogin(TestData.VALID_LOGIN);
        pageProvider.loginPage().enterPassword(TestData.VALID_PASSWORD);
        pageProvider.loginPage().clickOnButtonSingIn();
        pageProvider.loginPage().pressAccountButton();
        pageProvider.loginPage().clickOnClosePopupButton();
        pageProvider.myAccount().clickOnLogoutButton();




    }

}
