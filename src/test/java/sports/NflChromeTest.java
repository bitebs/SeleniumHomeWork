package sports;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class NflChromeTest {
    protected static WebDriver driver = null;
    protected final String baseUrl = "https://www.nfl.com";


    @Test
    @Order(1)
    //@Disabled
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }



    @Test
    @Order(2)
    //@Disabled
    public void news() throws InterruptedException {
        driver.get(baseUrl + "/news/");
        System.out.println(driver.getTitle());
        Assertions.assertTrue(driver.getTitle().toUpperCase().contains
                ("News".toUpperCase()));
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }

    @Test
    @Order(3)
    public void teams() throws InterruptedException {
        //WebElement button = driver.findElement(By.xpath("//*[@id='mobile-expanded-menu']"));
        //button.click();
        driver.get(baseUrl + "/teams/");
        System.out.println(driver.getTitle());
        Assertions.assertTrue(driver.getTitle().toUpperCase().contains
                ("Teams".toUpperCase()));
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }

    @Test
    @Order(4)
    public void stats() throws InterruptedException {
        //WebElement button = driver.findElement(By.xpath("//*[@id='mobile-expanded-menu']"));
        //button.click();
        driver.get(baseUrl + "/stats/player-stats/");
        System.out.println(driver.getTitle());
        Assertions.assertTrue(driver.getTitle().toUpperCase().contains
                ("Stats".toUpperCase()));
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }

    @Test
    @Order(5)
    //@Disabled
    public void Register1() throws InterruptedException {
        //WebElement button = driver.findElement(By.xpath("//*[@id='gigya-login-form']"));
        //button.click();
        driver.get(baseUrl + "/account/sign-up");
        System.out.println(driver.getTitle());
        Assertions.assertTrue(driver.getTitle().toUpperCase().contains
                ("NFL.com".toUpperCase()));
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }

    @Test
    @Order(6)
    //@Disabled
    public void SingUp() {

        WebElement email = driver.findElement(By.id("gigya-textbox-email"));
        email.sendKeys("Vitebs123@gmail.com");
        WebElement password = driver.findElement(By.id("gigya-password-68477116535307790"));
        password.sendKeys("4b708ObH$");
        WebElement FirstName = driver.findElement(By.id("gigya-textbox-125102978824046530"));
        FirstName.sendKeys("Dima");
        WebElement LastdName = driver.findElement(By.id("gigya-textbox-151031872248055260"));
        LastdName.sendKeys("Dima");
        Select country = new Select(driver.findElement(By.id("gigya-dropdown-122605313215671780")));
        country.selectByVisibleText("Belarus");
        WebElement BirthMonth = driver.findElement(By.id("gigya-dropdown-45121833129367120"));
        BirthMonth.sendKeys("January");
        WebElement BirthDay = driver.findElement(By.id("gigya-dropdown-135772554565020860"));
        BirthDay.sendKeys("19");
        WebElement BirthYear = driver.findElement(By.id("gigya-dropdown-114509211648812350"));
        BirthYear.sendKeys("1984");
        //WebElement checkbox = driver.findElement(By.id("gigya-checkbox-4274723795332473"));
        //checkbox.click();
        WebElement button = driver.findElement(By.xpath("//*[@id='gigya-register-form']"));
        button.click();
    }


}
