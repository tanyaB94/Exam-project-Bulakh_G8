package pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonActionsWithElements;


public class HeaderElement extends CommonActionsWithElements {


    @FindBy(xpath = "//*[@class='action-btn__ActionBtn-zbpc1m-1 evsxEe]")
    private WebElement accountButton;

    @FindBy(xpath = "//*[@class='sc-jGVbWl jJNFwQ']")
    private WebElement favoriteButton;

    @FindBy(xpath ="//button[@data-testid='cart-button']")
    private WebElement basketButton;







    public HeaderElement(WebDriver webDriver) {
        super(webDriver);
    }


    public boolean isButtonSignOutVisible() {
        return isElementDisplayed(accountButton);
    }


    public void clickOnButtonFavorite() {
        clickOnElement(favoriteButton);
    }

    public void clickOnButtonBasket() {
        clickOnElement(basketButton);
    }



}
