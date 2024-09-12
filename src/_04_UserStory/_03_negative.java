package _04_UserStory;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;


    public class _03_negative extends BaseDriver {

        @Test
        public void Test1(){
            driver.get("https://www.akakce.com");


            WebElement loginButton = driver.findElement(By.xpath("//a[text()='Giriş Yap']"));
            loginButton.click();


            WebElement loginSubmitButton = driver.findElement(By.id("login-submit-button")); // ID'yi doğru olarak ayarlayın
            loginSubmitButton.click();



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


