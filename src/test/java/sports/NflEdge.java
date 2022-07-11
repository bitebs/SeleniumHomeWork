package sports;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class NflEdge extends NflChromeTest {
    //protected static WebDriver driver = null;
    //protected final String baseUrl = "https://www.nfl.com";


    @Test
    @Order(1)
    //@Disabled
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "D:/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }


}
