package setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SetupTest {

    public static WebDriver driver;
    public static JavascriptExecutor jse;
   public static WebDriverWait wait;
    @Test()
    void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = WebDriverManager.chromedriver().capabilities(options).create();

        wait = new WebDriverWait(driver, Duration.ofMillis(500));
        jse = (JavascriptExecutor) driver;
        driver.get("https://famcare.app");

//        sleep(3000);
    }
}
