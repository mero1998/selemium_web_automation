package specialist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.SetupTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class SearchTest {

    WebElement specialistSubTitle;
    WebElement searchBox;
    WebElement specialistNameBox;
    WebElement specialistProfileButtonBox;


    WebElement specialistName;

    @Test(priority = 1)
    public  void subTitleIsDisplayed() {
        specialistSubTitle = SetupTest.driver.findElement(By.xpath("//p[@class = 'mb-4 page-excerpt']"));
        Assert.assertTrue(specialistSubTitle.isDisplayed());
    }
    @Test(priority = 2)
    public  void sectionTitleIsCorrect() {
        Assert.assertEquals(specialistSubTitle.getText() , "اسماء اخصائيين نفسيين  وقائمة من الأخصائيين المعتمدين والمرّخصين معك ولأجلك في متنفّسك ومساحتك الآمنة");

    }

@Test(priority = 3)
public  void searchBoxIsDisplayed() {
    searchBox = SetupTest.driver.findElement(By.xpath("//input[@class = 'search-text']"));
    Assert.assertTrue(searchBox.isDisplayed());
}

    @Test(priority =4)
    public  void searchInSpecialist() {
        searchBox.sendKeys("محمد القحطاني");
        searchBox.submit();
//        SetupTest.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


    @Test(priority = 5)
    public  void matchSearchTextWithResultsIsDisplayed() {
//        SetupTest.wait.until(ExpectedCondition)

        specialistNameBox = SetupTest.driver.findElement(By.xpath("//div[@class = 'col-sm-6 col-md-4 col-lg-3 specialist-container']/div/h2"));
        Assert.assertTrue(specialistNameBox.isDisplayed());
    }

    @Test(priority = 6)
    public  void matchSearchTextWithResultsIsCorrect() {
//        SetupTest.wait.until(ExpectedConditions.visibilityOf(specialistNameBox));

        Assert.assertEquals(specialistNameBox.getText() , "محمد القحطاني");
    }
    @Test(priority = 7)
    public  void clickProfileMatchSearchTextWithResults() {
        SetupTest.jse.executeScript("window.scrollBy(0,200)");

//        SetupTest.wait.until(ExpectedConditions.visibilityOf(specialistNameBox));
        specialistProfileButtonBox = SetupTest.driver.findElement(By.xpath("//div[@class = 'col-sm-6 col-md-4 col-lg-3 specialist-container']/div/div/a[@class = 'btn btn-primary profile']"));

        Assert.assertTrue(specialistProfileButtonBox.isDisplayed());
    }


    @Test(priority = 8)
    public  void SpecialistProfileButtonBoxIsCorrect()  {
        Assert.assertEquals(specialistProfileButtonBox.getText() , "الملف الشخصي"
        );
    }
    @Test(priority = 9)
    public  void clickSpecialistProfileButtonBox()  {
        SetupTest.wait.until(ExpectedConditions.elementToBeClickable(specialistProfileButtonBox));
        specialistProfileButtonBox.click();

        specialistName = SetupTest.driver.findElement(By.xpath("//div[@class = 'container specialist-page']/div/div/div/h1"));
        Assert.assertTrue(specialistName.isDisplayed());

//        SetupTest.driver.get("https://famcare.app");

//
//    SetupTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
//

    }
}
