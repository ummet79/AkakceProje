package _03_UserStory;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_Positive extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.akakce.com/");
        Actions aksiyonlar=new Actions(driver);

        WebElement girisYap = driver.findElement(By.xpath("//a[text()='Giriş Yap']"));
        girisYap.click();
        MyFunc.Bekle(2);

        WebElement email = driver.findElement(By.xpath("//input[@id='life']"));
        email.sendKeys("TechnoStudy06@gmail.com");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.xpath("//input[@id='lifp']"));
        password.sendKeys("Password123");
        MyFunc.Bekle(2);

        WebElement inputButton= driver.findElement(By.xpath("//input[@id='lfb']"));
        inputButton.click();
        MyFunc.Bekle(2);

        WebElement hesabim = driver.findElement(By.cssSelector("[title='Hesabım']"));
        Action aksiyon=aksiyonlar.moveToElement(hesabim).build();
        aksiyon.perform();
        MyFunc.Bekle(2);


        WebElement exitBtn = driver.findElement(By.cssSelector("[href='#Çık']"));
        exitBtn.click();
        MyFunc.Bekle(2);


        WebElement GirisYapBtn = driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        Assert.assertTrue("Giriş yap sayfası görüntülenemedi",GirisYapBtn.getText().contains("Giriş"));

        BekleKapat();

    }
}