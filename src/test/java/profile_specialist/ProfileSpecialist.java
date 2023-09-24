package profile_specialist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.SetupTest;

public class ProfileSpecialist {

    WebElement informationTitle;
    WebElement bioTitle;
    WebElement certifiedLicensedTitle;
    WebElement certifiedLicensedContent;

    WebElement joinUsButton;

    WebElement modalDialog;
    WebElement textFiledName;
    WebElement textFiledMobile;
    WebElement textFiledDegree;
    WebElement textFiledSpecialization;
    WebElement textFiledYearsOfExperience;
    WebElement textFiledSocialMedia;
    WebElement sendButton;
    WebElement successMessage;
    WebElement closeButton;
    WebElement academyButton;
    WebElement browseCourseTitle;
    WebElement psychologicalBox;
    WebElement archiveTitle;




    @Test(priority = 1)
    public  void informationTitleIsDisplayed() {
        informationTitle = SetupTest.driver.findElement(By.xpath("//div[@class = 'specialist-details mb-md-5']/div/h2"));
        Assert.assertTrue(informationTitle.isDisplayed());
    }

    @Test(priority = 2)
    public  void informationTitleIsCorrect() {
        Assert.assertEquals(informationTitle.getText() , "معلومات الأخصائي");

    }

    @Test(priority = 3)
    public  void bioTitleIsDisplayed() {
        bioTitle = SetupTest.driver.findElement(By.xpath("//div[@class = 'specialist-details mb-md-5']/div[@class = 'info-list list-collapse']/div[1]/div/h5"));
        Assert.assertTrue(bioTitle.isDisplayed());
    }

    @Test(priority = 4)
    public  void bioTitleIsCorrect() {
        Assert.assertEquals(bioTitle.getText() , "نبذة عني");
    }

    @Test(priority = 5)
    public  void certifiedLicensedTitleIsDisplayed() {
        certifiedLicensedTitle = SetupTest.driver.findElement(By.xpath("//div[@class = 'specialist-details mb-md-5']/div[@class = 'info-list list-collapse']/div[2]/div/h5"));
        Assert.assertTrue(certifiedLicensedTitle.isDisplayed());
    }

    @Test(priority = 6)
    public  void certifiedLicensedTitleIsCorrect() {
        Assert.assertEquals(certifiedLicensedTitle.getText() , "مرخص معتمد");
    }

    @Test(priority = 7)
    public  void certifiedLicensedContentIsDisplayed() {
        certifiedLicensedContent = SetupTest.driver.findElement(By.xpath("//div[@class = 'specialist-details mb-md-5']/div[@class = 'info-list list-collapse']/div[2]/div/p"));
        Assert.assertTrue(certifiedLicensedContent.isDisplayed());
    }

    @Test(priority = 8)
    public  void certifiedLicensedContentIsCorrect() {
        Assert.assertEquals(certifiedLicensedContent.getText() , "مرخص معتمد من الهيئة السعودية للتخصصات الصحية");
    }

    @Test(priority = 9)
    public  void joinUsButtonDisplayed() {
        joinUsButton = SetupTest.driver.findElement(By.xpath("//button[@class=\"btn btn-primary btnForm ml-auto join-as-specialist\"]"));
        Assert.assertTrue(joinUsButton.isDisplayed());
    }
    @Test(priority = 10)
    public  void joinUsButtonIsCorrect() {
        Assert.assertEquals(joinUsButton.getText() , "انضم كأخصائي");
    }

    @Test(priority = 11)
    public  void clickJoinUsButtonIs() {

        SetupTest.wait.until(ExpectedConditions.elementToBeClickable(joinUsButton));
        joinUsButton.click();

    }
    @Test(priority = 12)
    public  void modalDialogDisplayed() {

        modalDialog = SetupTest.driver.findElement(By.xpath("//div[@id = 'joinUsModal']"));
//        SetupTest.wait.until(ExpectedConditions.visibilityOf(modalDialog));

        Assert.assertTrue(modalDialog.isDisplayed());
    }


    //div[@id = 'joinUsModal']/div/div/div[@class = 'modal-body']/div/div/form/div[2]/input
    @Test(priority = 13)
    public  void textFiledNameIsDisplayed() {
        textFiledName = SetupTest.driver.findElement(By.xpath("//div[@id = 'joinUsModal']/div/div/div[@class = 'modal-body']/div/div/form/div[2]/input"));
        Assert.assertTrue(textFiledName.isDisplayed());
    }
    @Test(priority = 14)
    public  void textFiledMobileIsDisplayed() {
        textFiledMobile = SetupTest.driver.findElement(By.xpath("//div[@id = 'joinUsModal']/div/div/div[@class = 'modal-body']/div/div/form/div[3]/input"));
        Assert.assertTrue(textFiledMobile.isDisplayed());
    }

    @Test(priority = 15)
    public  void textFiledDegreeIsDisplayed() {
        textFiledDegree = SetupTest.driver.findElement(By.xpath("//div[@id = 'joinUsModal']/div/div/div[@class = 'modal-body']/div/div/form/div[4]/input"));
        Assert.assertTrue(textFiledDegree.isDisplayed());
    }

    @Test(priority = 16)
    public  void textFiledSpecializationIsDisplayed() {
        textFiledSpecialization = SetupTest.driver.findElement(By.xpath("//div[@id = 'joinUsModal']/div/div/div[@class = 'modal-body']/div/div/form/div[5]/input"));
        Assert.assertTrue(textFiledSpecialization.isDisplayed());
    }

    @Test(priority = 17)
    public  void textFiledYearsOfExperienceIsDisplayed() {
        textFiledYearsOfExperience = SetupTest.driver.findElement(By.xpath("//div[@id = 'joinUsModal']/div/div/div[@class = 'modal-body']/div/div/form/div[6]/input"));
        Assert.assertTrue(textFiledYearsOfExperience.isDisplayed());
    }

    @Test(priority = 17)
    public  void textFiledSocialMediaIsDisplayed() {
        textFiledSocialMedia = SetupTest.driver.findElement(By.xpath("//div[@id = 'joinUsModal']/div/div/div[@class = 'modal-body']/div/div/form/div[7]/input"));
        Assert.assertTrue(textFiledSocialMedia.isDisplayed());
    }
    @Test(priority =18)
    public  void sendNameInTextFiled() {
        textFiledName.sendKeys("محمد احمد");
        textFiledName.submit();
//        SetupTest.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test(priority =19)
    public  void sendMobieInTextFiled() {
        textFiledMobile.sendKeys("9587654653");
        textFiledMobile.submit();
//        SetupTest.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test(priority =19)
    public  void sendDagreeInTextFiled() {
        textFiledDegree.sendKeys("BCs");
        textFiledDegree.submit();
//        SetupTest.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(priority =20)
    public  void sendSpecializationInTextFiled() {
        textFiledSpecialization.sendKeys("Software engineering");
        textFiledSpecialization.submit();
//        SetupTest.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test(priority =21)
    public  void sendYearsOfExperienceInTextFiled() {
        textFiledYearsOfExperience.sendKeys("3");
        textFiledYearsOfExperience.submit();
//        SetupTest.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(priority =22)
    public  void sendSocialMediaInTextFiled() {
        textFiledSocialMedia.sendKeys("mohammed.334");
        textFiledSocialMedia.submit();
//        SetupTest.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(priority = 23)
    public  void sendButtonIsDisplayed() {
        sendButton = SetupTest.driver.findElement(By.xpath("//div[@id = 'joinUsModal']/div/div/div[@class = 'modal-body']/div/div/form/input"));
        Assert.assertTrue(sendButton.isDisplayed());
    }
    @Test(priority = 24)
    public  void sendButtonIsCorrect() {

//        SetupTest.jse.executeScript("window.scrollBy(0,100)");

        Assert.assertEquals(sendButton.getAttribute("value") , "إرسال");
//       Assert.assertTrue(sendButton.getAttribute("value") == "إرسال"); ;
    }

    @Test(priority = 25)
    public  void clickSendButton() {
        SetupTest.wait.until(ExpectedConditions.elementToBeClickable(sendButton));

        sendButton.click();
//        SetupTest.jse.executeScript("window.scrollBy(0,100)");
//        SetupTest.jse.executeScript("window.scrollBy(0,100)");

//        Assert.assertEquals(sendButton.getAttribute("value") , "إرسال");
//       Assert.assertTrue(sendButton.getAttribute("value") == "إرسال"); ;
    }

    @Test(priority = 26)
    public  void successMessageIsDisplayed() {
        successMessage = SetupTest.driver.findElement(By.xpath("//div[@id = 'joinUsModal']/div/div/div[@class = 'modal-body']/div/div/form/div[@class = 'wpcf7-response-output']\n"));
        SetupTest.jse.executeScript("arguments[0].scrollIntoView(true);", successMessage);
        SetupTest.wait.until(ExpectedConditions.visibilityOf(successMessage));

        Assert.assertTrue(successMessage.isDisplayed());

    }

    @Test(priority = 27)
    public  void successMessageIsCorrect() {
            Assert.assertEquals(successMessage.getText(), "شكراً لك. لقد تم الإرسال بنجاح.");
    }



    @Test(priority = 28)
    public  void closeButtonIsDisplayed() {
        closeButton = SetupTest.driver.findElement(By.xpath("//*[@id=\"joinUsModal\"]/div/div/button/span"));

        Assert.assertTrue(closeButton.isDisplayed());
    }
    @Test(priority = 29)
    public  void clickCloseButton() {
        SetupTest.wait.until(ExpectedConditions.elementToBeClickable(closeButton));
        closeButton.click();
        informationTitleIsDisplayed();
        informationTitleIsCorrect();
    }
    @Test(priority = 30)
    public  void academyButtonIsDisplayed() {
        academyButton = SetupTest.driver.findElement(By.xpath("//div[@class = 'collapse navbar-collapse']/ul/li[@class = 'menu-item menu-item-type-custom menu-item-object-custom menu-item-1227 nav-item']/a"));

        Assert.assertTrue(academyButton.isDisplayed());
    }


    @Test(priority = 31)
    public  void academyButtonIsCorrect() {
        Assert.assertEquals(academyButton.getText(), "الأكاديمية");
    }
    @Test(priority = 32)
    public  void clickAcademyButton() {
        SetupTest.wait.until(ExpectedConditions.elementToBeClickable(academyButton));

        academyButton.click();
    }

    @Test(priority = 33)
    public  void browseCourseTitleIsDisplayed() {
        browseCourseTitle = SetupTest.driver.findElement(By.xpath("//div[@class = 'elementor-widget-container']/h1"));

        Assert.assertTrue(browseCourseTitle.isDisplayed());

    }

    @Test(priority = 34)
    public  void browseCourseTitleIsCorrect() {
        Assert.assertEquals(browseCourseTitle.getText(), "تصفّح دوراتك حسب احتياجك!");
    }

    @Test(priority = 35)
    public  void psychologicalBoxIsDisplayed() {
        psychologicalBox = SetupTest.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[2]/div[2]/div/div/section[2]/div/div[1]/div/div/div/a/div/div/div[2]/div[1]/h3/span"));

        Assert.assertTrue(psychologicalBox.isDisplayed());

    }

    @Test(priority = 36)
    public  void psychologicalBoxTitleIsCorrect() {
        Assert.assertEquals(psychologicalBox.getText(), "الجانب النفسي");
    }
    @Test(priority = 37)
    public  void clickPsychologicalBox() {
        SetupTest.wait.until(ExpectedConditions.elementToBeClickable(psychologicalBox));

        psychologicalBox.click();
    }

    //div[@class = 'page-header_title']
    @Test(priority = 38)
    public  void archiveTitleIsDisplayed() {
        archiveTitle = SetupTest.driver.findElement(By.xpath("//div[@class = 'page-header_title']"));
        SetupTest.wait.until(ExpectedConditions.visibilityOf(archiveTitle));

        Assert.assertTrue(archiveTitle.isDisplayed());

    }

    @Test(priority = 39)
    public  void archiveTitleIsCorrect() {
        Assert.assertEquals(archiveTitle.getText(), "الأرشيف");
    }

}
