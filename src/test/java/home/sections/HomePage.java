package home.sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.SetupTest;

public class HomePage {

   public static WebElement getSpecialistBox(){
       return SetupTest.driver.findElement(By.xpath("//div[@class = 'kc-col-container']/div[@class = 'position-relative specialists-swiper-wrap']/div/div/div[@data-swiper-slide-index = '2']"));

    }
}
