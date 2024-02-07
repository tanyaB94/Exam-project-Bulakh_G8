package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemsPage extends ParentPage {


    @Override
    protected String getRelativeUrl() {
        return null;
    }

    public ItemsPage(WebDriver webDriver) {
        super(webDriver);
    }


    @FindBy(xpath = "(//button[@class='qs-action-icon__container'])[position()=3]")
    private WebElement addToBasketButton;

    @FindBy(xpath = "//div[@class=\"qs_button-text-container\"]")
    private WebElement choseSize;

    @FindBy(xpath = "//div[@class='qs-modal__icon']")
    private WebElement closeAddedWindow;




    public ItemsPage clickOnAddToBasketButton() {
        clickOnElement(addToBasketButton);
        return this;
    }

    public ItemsPage clickOnCloseAddedWindow() {
        clickOnElement(closeAddedWindow);
        return this;
    }

    public ItemsPage clickOnChoseSize() {
        clickOnElement(choseSize);
        return this;
    }


}
