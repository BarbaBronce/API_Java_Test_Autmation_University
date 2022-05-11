package src.test.Java.taudemo;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {
    private BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {

        driver = browserGetter.getChromeDriver();
    }

    @AfterAll
    public void afterAll() {

        driver.quit();
    }

    @Test
    public void openTheComPageAndCheckTheTitle() {
        String expectedComTitle = "Example title";
        driver.get("https://www.example.com");
        assertEquals(expectedComTitle, driver.getTitle());
    }

    @Test
    public void openTheOrgPageAndCheckTheTitle() {
        String expectedOrgTitle = "Example title";
        driver.get("https://www.example.org");
        assertEquals(expectedOrgTitle, driver.getTitle());
    }

}
