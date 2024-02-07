package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class MyAccount extends ParentPage{

    @FindBy(xpath = "//li[@data-testid='logout']")
    private WebElement logoutButton;

     public MyAccount(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return null;
    }

    public void clickOnLogoutButton() {
        clickOnElement(logoutButton);
    }



}
