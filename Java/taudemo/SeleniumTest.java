package Java.taudemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class SeleniumTest {
    private BrowserGetter browserGetter =  new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll(){

    }

    @AfterAll
    public void afterAll(){

    }

    @Test
    public void openThePageAndCheckTheTitle(){
        String expectedTitle = "Example title";

    }
}
