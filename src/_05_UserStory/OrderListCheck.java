package _05_UserStory;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class OrderListCheck extends BaseDriver {
    @Test
    public void test() {
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);
        WebElement login = driver.findElement(By.cssSelector("[id='H_rl_v8'] > :nth-child(1)+a"));
        login.click();
        MyFunc.Bekle(2);

        WebElement eMail = driver.findElement(By.xpath("//span[@class='frm_v8'] / input[@name='life']"));
        eMail.sendKeys("TechnoStudy06@gmail.com");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.xpath("//input[@class='t' and @name='lifp']"));
        password.sendKeys("Password123");
        MyFunc.Bekle(2);

        WebElement login2 = driver.findElement(By.cssSelector("[type='submit'][class='s'][value='Giriş yap']"));
        login2.click();
        MyFunc.Bekle(2);

        WebElement account = driver.findElement(By.xpath("//a[@title='Hesabım']"));
        account.click();
        MyFunc.Bekle(2);


        WebElement account2 = driver.findElement(By.xpath("//a[text()='Hesabım']"));
        account2.click();
        MyFunc.Bekle(2);

        WebElement siparislerim = driver.findElement(By.xpath("//li/a[text()='Siparişlerim']"));
        siparislerim.click();
        MyFunc.Bekle(2);

        try {
            WebElement Message = driver.findElement(By.xpath("//div[contains(text(),'Kayıtlı siparişiniz bulunmuyor.')]"));
            System.out.println("Sipariş listesi boş.");
        } catch (NoSuchElementException e) {
            System.out.println("Sipariş listesi dolu veya mesaj bulunamadı.");
        }

        BekleKapat();
    }
}
