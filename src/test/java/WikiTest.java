import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WikiTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.wikipedia.org/");
    }

    @Test
    public void searchArticleTest() {
        type(By.cssSelector("#searchInput"), "WebDriver");
        click(By.cssSelector("[type='submit']"));
    }

    private void type(By locator, String text) {
        click(locator);
        //click(By.cssSelector("#searchInput"));
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    private void click(By locator) {
        driver.findElement(locator).click();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
