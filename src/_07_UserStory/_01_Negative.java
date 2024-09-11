package _07_UserStory;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Negative extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(1);

        WebElement sigIn = driver.findElement(By.cssSelector("[id='H_rl_v8']>:nth-child(2)"));
        sigIn.click();
        MyFunc.Bekle(1);

        WebElement mail = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        mail.sendKeys("TechnoStudy06@gmail.com");
        MyFunc.Bekle(1);

        WebElement password = driver.findElement(By.xpath("(//*[@type='password'])[1]"));
        password.sendKeys("Password123");
        MyFunc.Bekle(1);

        WebElement SigIn = driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        SigIn.click();
        MyFunc.Bekle(1);

        WebElement humonIcon = driver.findElement(By.cssSelector("[title='Hesabım']"));
        humonIcon.click();
        MyFunc.Bekle(1);

        WebElement myAccount = driver.findElement(By.xpath("//a[text()='Hesabım']"));
        myAccount.click();
        MyFunc.Bekle(1);

        WebElement deleteAccount = driver.findElement(By.cssSelector("[href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
        deleteAccount.click();
        MyFunc.Bekle(1);

        WebElement passwordAgain = driver.findElement(By.cssSelector("[onfocusout='ControlPassword();']"));
        passwordAgain.sendKeys("Passw3");
        MyFunc.Bekle(2);

        WebElement delete_MyAccount = driver.findElement(By.cssSelector("[style='text-align:center;margin-left:0px !important']"));
        delete_MyAccount.click();

        Assert.assertTrue("Yanlış şifre ", passwordAgain.equals("Password123"));

        BekleKapat();
    }
}