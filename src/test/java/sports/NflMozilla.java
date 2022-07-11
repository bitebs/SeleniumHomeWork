package sports;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class NflMozilla extends NflChromeTest {
    //protected static WebDriver driver = null;
    //protected final String baseUrl = "https://www.nfl.com";


    @Test
    @Order(1)
    //@Disabled
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }


}
