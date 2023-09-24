package home.sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.SetupTest;

import static java.lang.Thread.sleep;

public class HeaderTest {


  static  public  WebElement headerText;
    WebElement subHeaderText;
    WebElement bookButton;
    WebElement headerImg;
    WebElement firstSectionTitle;
    WebElement firstImageBoxFirstSection;
    WebElement firstTitleBoxFirstSection;




    @Test(priority = 1)
   static public void textHeaderIsDisplayed(){
        headerText = SetupTest.driver.findElement(By.xpath("//div[@class = 'kc-col-container']/div[@class = 'kc-elm kc-css-964511 kc-title-wrap kc-pc-loaded']/h2[@class = \"kc_title\"]"));
        Assert.assertTrue(headerText.isDisplayed());

    }
    @Test(priority = 2)

    void textHeaderIsCorrect(){
        Assert.assertEquals(headerText.getText(), "ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%");
    }

    @Test(priority = 3 )
    void textSubHeaderIsDisplayed(){
        subHeaderText = SetupTest.driver.findElement(By.xpath("//div[@class = 'kc-col-container']/div[@class = 'kc-elm kc-css-912794 kc_text_block kc-pc-loaded']/p"));
//        SetupTest.wait.until(ExpectedConditions.visibilityOf(bookButton));

        Assert.assertTrue(subHeaderText.isDisplayed());

    }
    @Test(priority = 4)

    void textSubHeaderIsCorrect(){
        Assert.assertEquals(subHeaderText.getText(), "لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن ");
    }


    @Test(priority = 5)
    void bookButtonIsDisplayed(){
        bookButton = SetupTest.driver.findElement(By.xpath("//div[@class = 'kc-col-container']/div[@class = 'kc-elm kc-css-780143']/a"));

        Assert.assertTrue(bookButton.isDisplayed());

    }
    @Test(priority = 6, enabled = false)

    void bookButtonIsCorrectText() {
        Assert.assertEquals(bookButton.getText(),
                "احجز جلستك الأولى");
        bookButton.click();

        SetupTest.driver.get("https://famcare.app");
//        sleep(2000);
    }

    @Test(priority = 7)
    void headerImgIsDisplayed(){
        headerImg = SetupTest.driver.findElement(By.xpath("//div[@class = \"kc-col-container\"]/div[@class = \"kc-elm kc-css-107922 kc_shortcode kc_single_image d-md-block\"]/img"));
        Assert.assertTrue(headerImg.isDisplayed());
    }


}

