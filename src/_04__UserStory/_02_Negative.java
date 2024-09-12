package _04__UserStory;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Negative extends BaseDriver {

    @Test
    public void Test2(){

        driver.get("https://www.akakce.com/");

        WebElement loginButton=driver.findElement(By.xpath("//*[@href='/akakcem/giris/']"));
        loginButton.click();
        MyFunc.Bekle(1);

        WebElement Email=driver.findElement(By.xpath("//input[@id='life']"));
        Email.sendKeys("TechnoStudy06@gmail.com");
        MyFunc.Bekle(1);

        WebElement password=driver.findElement(By.xpath("//input[@id='lifp']"));
        password.sendKeys("Password456");  // yanlış şifre girişi
        MyFunc.Bekle(1);

        WebElement GirişYap=driver.findElement(By.xpath("//input[@id='lfb']"));
        GirişYap.click();
        MyFunc.Bekle(1);

        Assert.assertTrue("Bu Emaile ait kayıtlı hesap bulunamadı",Email.getText().contains("dinotox898@esterace.com"));

        BekleKapat();


    }


}
