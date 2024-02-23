package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BasketPage extends ParentPage{


    @FindBy(xpath = "//button[@class='product-list__RemoveButton-mh8fks-10 kSUDeX col']")
    private WebElement deleteFromBasketButton;

    @FindBy(xpath = "//h1[@class='headline__HeadlineComponent-sc-1b12ysc-0 gPoDim']")
    private WebElement validationMessage;

    @FindBy(xpath = "//*[@class='badge__BadgeComponent-kyo77g-0 iYOftF']")
    private WebElement emptyBasket;

    public BasketPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/basket";
    }



    public BasketPage clickOnDeleteFromBasket() {
        clickOnElement(deleteFromBasketButton);
        return this;
    }

    public BasketPage checkValidationMessage() {
        checkIsElementVisible(validationMessage);
        return this;
    }

    private BasketPage checkIsElementVisible(WebElement validationMessage) {
        return this;

    }

    public boolean isBasketContainsItems(){
        return this.isBasketContainsItems();
    }
}
