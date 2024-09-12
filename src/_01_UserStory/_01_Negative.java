package _01_UserStory;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.junit.Test;


public class _01_Negative extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.akakce.com/");

        WebElement hesapAc = driver.findElement(By.xpath("(//*[text()='Hesap Aç'])[1]"));
        hesapAc.click();


        WebElement isim = driver.findElement(By.xpath("(//*[@maxlength='20'])[1]"));
        isim.sendKeys("");


        WebElement email = driver.findElement(By.xpath("(//*[@type='email'])[3]"));
        email.sendKeys("TechnoStudy06@gmail.com");
        MyFunc.Bekle(3);

        WebElement email2 = driver.findElement(By.xpath("(//*[@type='email'])[4]"));
        email2.sendKeys("TechnoStudy06@gmail.com");
        MyFunc.Bekle(3);

        WebElement password = driver.findElement(By.xpath("(//*[@type='password'])[2]"));
        password.sendKeys("Password123");
        MyFunc.Bekle(3);

        WebElement password2 = driver.findElement(By.xpath("(//*[@type='password'])[3]"));
        password2.sendKeys("Password123");
        MyFunc.Bekle(3);

        WebElement kadın = driver.findElement(By.xpath("(//*[@onclick='changeGenderChoice()'])[1]"));
        kadın.click();
        MyFunc.Bekle(3);


        WebElement KullanımSözleşmesi = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        KullanımSözleşmesi.click();
        MyFunc.Bekle(3);

        WebElement HesapAç = driver.findElement(By.xpath("(//input[@value='Hesap aç'])[2]"));
        HesapAç.click();
        MyFunc.Bekle(3);

        Assert.assertTrue("Lütfen adınız yazın",isim.equals("Techno"));

        BekleKapat();
    }
}
