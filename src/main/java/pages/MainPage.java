package pages;

import data.TestData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.elements.HeaderElement;

public class MainPage extends ParentPage{


    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }



    @Override
    protected String getRelativeUrl() {
        return "/";
    }

    public MainPage checkIsRedirectToMainPage() {
        CheckURL();
        Assert.assertTrue("Invalid page", webDriver.getCurrentUrl().equals(baseURL));
        return this;
    }

    public HeaderElement getHeader() {
        return new HeaderElement(webDriver);
    }

    public MainPage openMainPageAndLoginIfNeeded() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.openLoginPage();
        if(this.getHeader().isButtonSignOutVisible()) {
            logger.info("User is already logged in");
        } else {
            loginPage.enterLogin(TestData.VALID_LOGIN);
            loginPage.enterPassword(TestData.VALID_PASSWORD);
            loginPage.clickOnButtonSingIn();
            checkIsRedirectToMainPage();
            logger.info("User was logged in");
        }
        return this;
    }







}
