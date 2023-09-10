import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class home_page_test {


    WebDriver driver;
    JavascriptExecutor jse;
    @BeforeClass
    void setUp(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = WebDriverManager.chromedriver().capabilities(options).create();

        jse = (JavascriptExecutor) driver;
        driver.get("");

    }

}
