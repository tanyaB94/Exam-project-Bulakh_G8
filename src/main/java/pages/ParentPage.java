package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

abstract public class ParentPage extends CommonActionsWithElements {

    final String baseURL = "https://www.sinsay.com/ua/uk/";

    public ParentPage(WebDriver webDriver) {
        super(webDriver);
    }


    abstract protected String getRelativeUrl();

    protected void CheckURL() {
        Assert.assertEquals("Invalid page"
                , baseURL + getRelativeUrl()
                , webDriver.getCurrentUrl()

        );
    }

    protected void checkUrlWithPattern() {
        Assert.assertTrue("Invalid page \n"
                        +"Expected result: " + baseURL + getRelativeUrl() + "\n"
                        +"Actual result: " + webDriver.getCurrentUrl()
                , webDriver.getCurrentUrl()
                        .matches(baseURL + getRelativeUrl())
        );

    }
}
