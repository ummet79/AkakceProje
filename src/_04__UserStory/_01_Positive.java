package _04__UserStory;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class _01_Positive extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.akakce.com/");

        WebElement loginButton=driver.findElement(By.xpath("//*[@href='/akakcem/giris/']"));
        loginButton.click();
        MyFunc.Bekle(1);

        WebElement Email=driver.findElement(By.xpath("//input[@id='life']"));
        Email.sendKeys("TechnoStudy06@gmail.com");
        MyFunc.Bekle(1);

        WebElement password=driver.findElement(By.xpath("//input[@id='lifp']"));
        password.sendKeys("Password123");
        MyFunc.Bekle(1);

        WebElement GirişYap=driver.findElement(By.xpath("//input[@id='lfb']"));
        GirişYap.click();
        MyFunc.Bekle(1);


        BekleKapat();


    }

}
