import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class FirstTest {
    WebDriver wd;

    @BeforeClass
    public void setUp() {

        wd = new ChromeDriver();
        wd.manage().window().maximize();

        wd.get("https://www.google.com/");

        }

    @Test
    public void openGoogle (){

        wd.findElement(By.name("q")).click();
        wd.findElement(By.name("q")).clear();
        wd.findElement(By.name("q")).sendKeys("WebDriver"+Keys.ENTER);

        wd.quit();
    }

    @Test
    public void openGoogle2 (){

        wd.findElement(By.name("q")).click();
        wd.findElement(By.name("q")).clear();
        wd.findElement(By.name("q")).sendKeys("WebDriver"+Keys.ENTER);

    }

    @AfterClass

    public void tearDown() {
        wd.quit();
    }
}
