package _02_UserStory;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_Positive extends BaseDriver {
    public _01_Positive() {
    }

    @Test
    public void Test1() {
        driver.get("https://www.akakce.com/");
        WebElement login = driver.findElement(By.xpath("//div[@class='g-3_v8 hm_hp_v8'] /div[1]/a[2] "));
        login.click();
        MyFunc.Bekle(1);
        WebElement email = driver.findElement(By.cssSelector("form[action='/akakcem/nojs/'][method='post'] > span > input[name='life'][type='email'][maxlength='100']"));
        email.sendKeys(new CharSequence[]{"TechnoStudy06@gmail.com"});
        MyFunc.Bekle(1);
        WebElement password = driver.findElement(By.xpath("//form[@action='/akakcem/nojs/'][@method='post'] / span / input[@name='lifp'][@type='password'][@maxlength='16']"));
        password.sendKeys(new CharSequence[]{"Password123"});
        MyFunc.Bekle(1);
        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit'][value='Giriş yap']"));
        loginButton.click();
        MyFunc.Bekle(1);
        WebElement checkCorrect = driver.findElement(By.xpath("//a[@rel='nofollow'][@href='/akakcem/'][text()='Techno']"));
        System.out.println(checkCorrect.getText());
        Assert.assertTrue("Hesaba Giriş Yapılamadı", checkCorrect.getText().contains("Techno"));
        WebElement profileItem = driver.findElement(By.cssSelector("a[rel='nofollow'][href='/akakcem/'][title='Hesabım']"));
        (new Actions(driver)).click(profileItem).build().perform();
        MyFunc.Bekle(1);
        WebElement profileEntry = driver.findElement(By.xpath("//*[text()=' Merhaba']/../a[@rel='nofollow'][@href='/akakcem/']"));
        (new Actions(driver)).click(profileEntry).build().perform();
        MyFunc.Bekle(1);
        WebElement userInformation = driver.findElement(By.xpath("//b[text()='Merhaba! '][text()='Techno Study']"));
        System.out.println(userInformation.getText());
        Assert.assertTrue("Profile Giriş Yapılamadı", userInformation.getText().contains("Merhaba"));
        BekleKapat();
    }
}

