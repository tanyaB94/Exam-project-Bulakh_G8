package pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends ParentPage{

    @FindBy(xpath = "//*[@id='login[username]_id']")
    private WebElement loginInput;

    @FindBy(xpath = "//*[@id='login[password]_id']")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@class='primary__PrimaryButtonComponent-sc-1pct4vx-0 fDECVK']")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@class='action-btn__ActionBtn-zbpc1m-1 evsxEe']")
    private WebElement accountButton;

    @FindBy(xpath = "//*[@id = \"cookiebotDialogOkButton\" and @onclick=\"window.cookiebotLpp.okButtonSubmit()\"]")
    private WebElement cookieButton;

    @FindBy(xpath = "//*[@class='ds-icon outline-close ds-icon-size__l']")
    private WebElement closePopupButton;

    @FindBy(xpath = "(//a[@class='inner-link__StyledInnerLink-j7xczh-1 jiYNix'])[position()=1]")
    private WebElement itemPage;

    @FindBy(xpath = "//div[@class='sc-TmdmN kRNdCB']")
    private WebElement invalidLoginMessage;




    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

    @Override
    protected String getRelativeUrl() {
        return null;
    }

    public void openLoginPage(){
        try {
            webDriver.get(baseURL);
            logger.info("Login page was opened " + baseURL);
        }catch (Exception e){
            Assert.fail("Can not work with browser");
        }



}


    public LoginPage pressAccountButton() {
        clickOnElement(accountButton);
        return this;
    }

    public LoginPage enterLogin(String login) {
        enterTextInToInput(loginInput, login);
        return this;
    }

    public LoginPage enterPassword(String password) {
        enterTextInToInput(passwordInput, password);
        return this;
    }

    public LoginPage fillLoginForm(String login, String password) {
        enterTextInToInput(loginInput, login);
        return this;
    }

    public LoginPage clickOnButtonSingIn() {
        clickOnElement(loginButton);
        return this;
    }



        public LoginPage clickOnClosePopupButton() {
            if (isElementDisplayed(closePopupButton)) {
                clickOnElement(closePopupButton);
            }
            return this;
        }

    public LoginPage exeptCookie() {
        if (isElementDisplayed(cookieButton)) {
            clickOnElement(cookieButton);
        }
        return this;
    }

    public LoginPage clickOnItemPage() {
        wait.until(ExpectedConditions.visibilityOf(itemPage));
        clickOnElement(itemPage);
        return this;
    }


    public boolean isButtonSingInVisible() {
        return isElementDisplayed(loginButton);
    }

    public boolean isInvalidLoginMessageDisplayed() {
        return isElementDisplayed(invalidLoginMessage);

    }
}
