package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FavoritesPage extends ParentPage{

    public FavoritesPage(WebDriver webDriver) {
        super(webDriver);
    }

    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

    @Override
    protected String getRelativeUrl() {
        return null;
    }

    @FindBy(xpath ="//*[@class='sc-jHVedQ kxZKPm']")
    private WebElement countOfFavorites;

    @FindBy(xpath = "(//div[@data-testid=\"wishlist_options_button\"])[1]")
    private WebElement navigationMenu;

    @FindBy(xpath = "//div[@data-testid='wishlist_Видалити з вибраних']")
    private WebElement deleteFromFavorites;

    @FindBy(xpath = "//*[@class='sc-dwfUuu QIqYX']")
    private WebElement validationMessage;








    public FavoritesPage getCountOfFavorites() {
        clickOnElement(countOfFavorites);
        return this;

    }



    public FavoritesPage clickOnNavigationMenu() {
        wait.until(ExpectedConditions.visibilityOf(navigationMenu));
        clickOnElement(navigationMenu);
        return this;
    }


    public FavoritesPage clickOnDeleteFromFavorites() {
        wait.until(ExpectedConditions.visibilityOf(deleteFromFavorites));
        clickOnElement(deleteFromFavorites);
        return this;

    }

    public FavoritesPage checkValidationMessage(){
        wait.until(ExpectedConditions.textToBePresentInElement(validationMessage, "Товар видалено зі списку бажань"));
        checkTextInElement(validationMessage, "Товар видалено зі списку бажань");
        return this;

    }


    }
