package home.sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.SetupTest;

import static java.lang.Thread.sleep;

public class OfficialAgenciesSectionTest {



    WebElement firstSectionTitle;
    WebElement firstImageBoxFirstSection;
    WebElement firstTitleBoxFirstSection;


    @Test(priority = 1)
    void titleFirstSectionIsDisplayed() throws InterruptedException {
        SetupTest.jse.executeScript("window.scrollBy(0,600)");
//        SetupTest.jse.executeScript("window.scrollBy(0,-200)");
        firstSectionTitle = SetupTest.driver.findElement(By.xpath("//section[@class = \"kc-elm kc-css-16652 kc_row\"]/div[@class = 'kc-row-container  kc-container']/div/div/div/div/h2[@class= \"kc_title\"]"));
        Assert.assertTrue(firstSectionTitle.isDisplayed());

    }

    @Test(priority = 2)

    void titleFirstSectionIsCorrect(){

        Assert.assertEquals(firstSectionTitle.getText(), "تطبيق معتمد من الجهات الرسمية");
    }


    @Test(priority = 3)
    void ImageBoxFirstSectionIsDisplayed(){
        firstImageBoxFirstSection = SetupTest.driver.findElement(By.xpath("//section[@class = \"kc-elm kc-css-16652 kc_row\"]/div/div/div/div/div[2]/div[1]/div/div[1]/img"));
        Assert.assertTrue(firstImageBoxFirstSection.isDisplayed());
    }

    @Test(priority = 4)
    void TitleBoxFirstSectionIsDisplayed() throws InterruptedException {


//        sleep(7000);
        firstTitleBoxFirstSection = SetupTest.driver.findElement(By.xpath("//section[@class = \"kc-elm kc-css-16652 kc_row\"]/div/div/div/div/div[2]/div[1]/div/div[2]/h3"));
//        SetupTest.wait.until(ExpectedConditions.visibilityOf(firstTitleBoxFirstSection));

        Assert.assertTrue(firstTitleBoxFirstSection.isDisplayed());
    }
    @Test(priority = 5)
    void TitleBoxFirstSectionIsCorrect(){
        Assert.assertEquals(firstTitleBoxFirstSection.getText(), "لوائح حماية البيانات");
    }
}
