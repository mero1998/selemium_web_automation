package home.sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.SetupTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class SpecialistsSectionTest {


    WebElement imageSpecialistBox;
    WebElement specialistNameBox;
    WebElement specialistFieldBox;
    WebElement specialistRateBox;
    WebElement specialistDescriptionBox;
    WebElement specialistProfileButtonBox;
    WebElement specialistBookButtonBox;
    WebElement contactWithSpecialistButton;
    WebElement specialistName;
    WebElement sectionTitle;
    WebElement famcareSpecialist;

    @Test(priority = 1)
    public  void sectionTitleIsDisplayed() {
        SetupTest.jse.executeScript("window.scrollBy(0,300)");
//            By imgLocator = RelativeLocator.with(By.tagName("img")).below(By.className("swiper-wrapper")).below(By.xpath("//div[3]/div/div/a"));
//*[@id="swiper-wrapper-86616d6b24ba4ff3"]/div[1]/div[@class = 'text-center specialist-profile']/div/a/img
        sectionTitle = SetupTest.driver.findElement(By.xpath("//section[@class = 'kc-elm kc-css-616729 kc_row']/div/div/div/div/div[1]/h2"));

//        SetupTest.driver.manage().timeouts().implicitlyWait(2, TimeUnit.MILLISECONDS);

//        imageProfileBox = SetupTest.driver.findElement(By.xpath("//div[@class='swiper-wrapper']/div[1]/div/div/a/img"));
//            imageProfileBox = SetupTest.driver.findElement(imgLocator);
//        SetupTest.wait.until(ExpectedConditions.visibilityOf(imageProfileBox));
//               SetupTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        SetupTest.wait.until(ExpectedConditions.visibilityOf(box));

            Assert.assertTrue(sectionTitle.isDisplayed());
//        SetupTest.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Test(priority = 2)
    public  void sectionTitleIsCorrect() {

        Assert.assertEquals(sectionTitle.getText() , "نخبة من الأخصائيين والمرشدين");

    }

    @Test(priority = 3)
    public  void FirstBoxIsDisplayed()  {
        SetupTest.jse.executeScript("window.scrollBy(0,100)");

//            By imgLocator = RelativeLocator.with(By.tagName("img")).below(By.className("swiper-wrapper")).below(By.xpath("//div[3]/div/div/a"));
//*[@id="swiper-wrapper-86616d6b24ba4ff3"]/div[1]/div[@class = 'text-center specialist-profile']/div/a/img
//        box = SetupTest.driver.findElement(By.xpath("//div[@class = 'kc-col-container']/div[@class = 'position-relative specialists-swiper-wrap']/div/div/div[@data-swiper-slide-index = '2']"));

//        SetupTest.driver.manage().timeouts().implicitlyWait(2, TimeUnit.MILLISECONDS);

//        imageProfileBox = SetupTest.driver.findElement(By.xpath("//div[@class='swiper-wrapper']/div[1]/div/div/a/img"));
//            imageProfileBox = SetupTest.driver.findElement(imgLocator);
//        SetupTest.wait.until(ExpectedConditions.visibilityOf(imageProfileBox));
//               SetupTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        SetupTest.wait.until(ExpectedConditions.visibilityOf(box));

        Assert.assertTrue(HomePage.getSpecialistBox().isDisplayed());
//        SetupTest.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test(priority = 4)
    public  void SpecialistImgBoxIsDisplayed()  {

        imageSpecialistBox = SetupTest.driver.findElement(By.xpath("//div[@class = 'kc-col-container']/div[@class = 'position-relative specialists-swiper-wrap']/div/div/div[@data-swiper-slide-index = '2']/div/div/a/img"));

        Assert.assertTrue(imageSpecialistBox.isDisplayed());

    }
    @Test(priority = 5)
    public  void SpecialistNameBoxIsDisplayed()  {
        specialistNameBox = SetupTest.driver.findElement(By.xpath("//div[@class = 'kc-col-container']/div[@class = 'position-relative specialists-swiper-wrap']/div/div/div[@data-swiper-slide-index = '2']/div/h2"));
        Assert.assertTrue(specialistNameBox.isDisplayed());
        SetupTest.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class = 'kc-col-container']/div[@class = 'position-relative specialists-swiper-wrap']/div/div/div[@data-swiper-slide-index = '2']/div/h2")));


    }

    @Test(priority = 6)
    public  void SpecialistNameBoxIsCorrect()  {
        Assert.assertEquals(specialistNameBox.getText() , "محمد القحطاني");
    }
    @Test(priority = 5)
    public  void SpecialistFieldBoxIsDisplayed()  {
        specialistFieldBox = SetupTest.driver.findElement(By.xpath("//div[@class = 'kc-col-container']/div[@class = 'position-relative specialists-swiper-wrap']/div/div/div[@data-swiper-slide-index = '2']/div/p[@class = 'speciality']/a"));
        Assert.assertTrue(specialistFieldBox.isDisplayed());
    }

    @Test(priority = 7)
    public  void SpecialistFieldBoxIsCorrect()  {
        Assert.assertEquals(specialistFieldBox.getText() , "أخصائي اجتماعي");
    }

    @Test(priority = 8)
    public  void SpecialistRateBoxIsDisplayed()  {
        specialistRateBox = SetupTest.driver.findElement(By.xpath("//div[@class = 'kc-col-container']/div[@class = 'position-relative specialists-swiper-wrap']/div/div/div[@data-swiper-slide-index = '2']/div/span"));
        Assert.assertTrue(specialistRateBox.isDisplayed());
    }
    @Test(priority = 9)
    public  void SpecialistRateBoxIsCorrect()  {
        Assert.assertEquals(specialistRateBox.getText() , "4.9/5");
    }
    @Test(priority = 8)
    public  void SpecialistDescriptionBoxIsDisplayed()  {
        specialistDescriptionBox = SetupTest.driver.findElement(By.xpath("//div[@class = 'kc-col-container']/div[@class = 'position-relative specialists-swiper-wrap']/div/div/div[@data-swiper-slide-index = '2']/div/p[@class = 'mb-3 bio']/a"));
        Assert.assertTrue(specialistDescriptionBox.isDisplayed());
    }
    @Test(priority = 9, enabled = false)
    public  void SpecialistDescriptionBoxIsCorrect()  {
        Assert.assertEquals(specialistDescriptionBox.getText() , "\n" +
                "      اينما تضعك الحياة اشرق بجمال \uD83C\uDF39\n" +
                "اخصائي اجتماعي ومرشد اسري\n" +
                "حاصل على درجة الماجستير\n" +
                "عضو في جمعية الاخصائيين الاجتماعيين\n" +
                " تقديم الاستشارات الاسرية والاجتماعية المتعلقة بالمشاكل الزواجية والاستشارات التربوية (كوبون خصم الزيارة الاولى MOK) ٢٠٪\u061C(كوبون الزيارات التالية)١٠%٣زياراتMOH19    ");
    }

    @Test(priority = 10)
    public  void SpecialistProfileButtonBoxIsDisplayed()  {
        specialistProfileButtonBox = SetupTest.driver.findElement(By.xpath("//div[@class = 'kc-col-container']/div[@class = 'position-relative specialists-swiper-wrap']/div/div/div[@data-swiper-slide-index = '2']/div/div[@class = 'd-flex justify-content-between buttons']/a[@class = 'btn btn-primary profile']"));
        Assert.assertTrue(specialistProfileButtonBox.isDisplayed());
    }
    @Test(priority = 11)
    public  void SpecialistProfileButtonBoxIsCorrect()  {
        Assert.assertEquals(specialistProfileButtonBox.getText() , "الملف الشخصي"
        );
    }
    @Test(priority = 12)
    public  void clickSpecialistProfileButtonBox()  {
                SetupTest.wait.until(ExpectedConditions.elementToBeClickable(specialistProfileButtonBox));
        specialistProfileButtonBox.click();

        specialistName = SetupTest.driver.findElement(By.xpath("//div[@class = 'container specialist-page']/div/div/div/h1"));
        Assert.assertTrue(specialistName.isDisplayed());

        SetupTest.driver.get("https://famcare.app");

//
//    SetupTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
//

    }
    @Test(priority = 13)
    public  void SpecialistBookButtonBoxIsDisplayed()  {
            SetupTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

        SetupTest.jse.executeScript("window.scrollBy(0,1000)");
        SetupTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        specialistBookButtonBox = SetupTest.driver.findElement(By.xpath("//div[@class = 'kc-col-container']/div[@class = 'position-relative specialists-swiper-wrap']/div/div/div[@data-swiper-slide-index = '2']/div/div[@class = 'd-flex justify-content-between buttons']/a[@id = 'bookNow']"));
        Assert.assertTrue(specialistBookButtonBox.isDisplayed());
    }
    @Test(priority = 14)
    public  void SpecialistBookButtonBoxIsCorrect()  {
        Assert.assertEquals(specialistBookButtonBox.getText() , "حجز موعد"
        );
    }
    @Test(priority = 15)
    public  void clickSpecialistBookButtonBox()  {
        SetupTest.wait.until(ExpectedConditions.elementToBeClickable(specialistBookButtonBox));
        specialistBookButtonBox.click();
        HeaderTest.textHeaderIsDisplayed();
    }


    @Test(priority = 16)
    public  void contactSpecialistButtonIsDisplayed()  {
        SetupTest.jse.executeScript("window.scrollBy(0,1100)");

        contactWithSpecialistButton = SetupTest.driver.findElement(By.xpath("//div[@class = 'kc_wrapper kc-col-inner-container']/div/a[@class = 'kc_button custom-btn btn btn-primary']"));
        Assert.assertTrue(contactWithSpecialistButton.isDisplayed());
    }
    @Test(priority = 17)
    public  void contactSpecialistButtonIsCorrect()  {
        Assert.assertEquals(contactWithSpecialistButton.getText() , "تواصل الآن"
        );
    }
    @Test(priority = 18)
    public  void clickContactWithSpecialistButton()  {
        SetupTest.wait.until(ExpectedConditions.elementToBeClickable(contactWithSpecialistButton));
        contactWithSpecialistButton.click();
//        SetupTest.driver.get("https://famcare.app");

//
//    SetupTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
//

    }
    @Test(priority = 18)

    public void famcareSpecialistIsDisplayed(){
        famcareSpecialist = SetupTest.driver.findElement(By.xpath("//h1[@class = 'mt-5 mb-3']"));
        Assert.assertTrue(famcareSpecialist.isDisplayed());
    }

    @Test(priority = 19)
    public  void famcareSpecialistIsCorrect()  {
        Assert.assertEquals(famcareSpecialist.getText() , "أخصائيين فامكير"
        );
    }
}

