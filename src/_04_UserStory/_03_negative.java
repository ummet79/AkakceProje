package _04_UserStory;

import org.junit.Test;
import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class _03_negative extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.akakce.com");


        WebElement loginButton = driver.findElement(By.xpath("//a[text()='Giriş Yap']")); // XPath doğru olmalı
        loginButton.click();

        // 3. Kullanıcı herhangi bir kullanıcı adı ve şifre girmeden, "Giriş Yap" butonuna tekrar tıklar.
        WebElement loginSubmitButton = driver.findElement(By.id("login-submit-button")); // ID'yi doğru olarak ayarlayın
        loginSubmitButton.click();

        // 4. Boş (NULL) verilerle giriş yapmayı deneme
        // Boş (NULL) bilgilerin başarısızlık mesajı veya uyarı ile sonuçlanmasını kontrol etme
        WebElement errorMessage = driver.findElement(By.id("error-message")); // Hata mesajının ID'sini doğru olarak ayarlayın
        assertTrue("Giriş işlemi başarısız oldu, uygun hata mesajı gösterilmedi.",
                errorMessage.isDisplayed() && errorMessage.getText().contains("Geçersiz e-posta veya şifre"));
    }

    @Test
    public void tearDown() {
        // Testten sonra tarayıcıyı kapatma
        if (driver != null) {
            driver.quit();
        }
    }
}


