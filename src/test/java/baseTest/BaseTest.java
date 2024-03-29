package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PageProvider;

import java.time.Duration;


public class BaseTest {
    WebDriver webDriver;
    protected Logger logger = Logger.getLogger(getClass());
    protected PageProvider pageProvider;

    @Before
    public void setup(){
        logger.info("----" + testName.getMethodName() + " was started ----");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://www.sinsay.com/ua/uk/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        logger.info("Browser was opened");
        pageProvider = new PageProvider(webDriver);
    }

        @After
    public void tearDown() {
        webDriver.quit();
        logger.info("Browser was closed");
        logger.info("----" + testName.getMethodName() + " was ended ----");

    }

    @Rule
    public TestName testName = new TestName();

}
