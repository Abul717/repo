import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyFirstTest {
    @Test
    public void FirefoxTestCase() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);
        driver.quit();
    }


}
