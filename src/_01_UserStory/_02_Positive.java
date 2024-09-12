package _01_UserStory;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_Positive extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.akakce.com/");

        WebElement hesapAc = driver.findElement(By.xpath("(//*[text()='Hesap Aç'])[1]"));
        hesapAc.click();
        MyFunc.Bekle(2);

        WebElement isim = driver.findElement(By.xpath("(//*[@maxlength='20'])[1]"));
        isim.sendKeys("Techno");
        MyFunc.Bekle(3);


        WebElement soyisim = driver.findElement(By.xpath("(//*[@maxlength='20'])[2]"));
        soyisim.sendKeys("Study");
        MyFunc.Bekle(3);

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

        WebElement gün = driver.findElement(By.xpath("(//select[@class='t'])[1]"));
        Select GunSecimi = new Select(gün);
        GunSecimi.selectByValue("1");
        MyFunc.Bekle(3);

        WebElement ay = driver.findElement(By.xpath("(//select[@class='t'])[2]"));
        Select AySecimi = new Select(ay);
        AySecimi.selectByValue("1");
        MyFunc.Bekle(3);

        WebElement yıl = driver.findElement(By.xpath("(//select[@class='t'])[3]"));
        Select YılSecimi = new Select(yıl);
        YılSecimi.selectByValue("1990");
        MyFunc.Bekle(3);

        WebElement KullanımSözleşmesi = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        KullanımSözleşmesi.click();
        MyFunc.Bekle(3);

        WebElement HesapAç = driver.findElement(By.xpath("(//input[@value='Hesap aç'])[2]"));
        HesapAç.click();
        MyFunc.Bekle(3);

        BekleKapat();

    }
}
