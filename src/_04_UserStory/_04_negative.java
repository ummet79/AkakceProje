package _04_UserStory;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

    public class _04_negative extends BaseDriver {
        @Test
        public void Test2(){
            driver.get("https://www.akakce.com");
            WebElement loginButton = driver.findElement(By.xpath("//a[text()='Giriş Yap']")); // XPath doğru olmalı
            loginButton.click();

            // 3. Kullanıcı geçersiz e-posta ve geçerli şifre girer.
            WebElement emailField = driver.findElement(By.id("email")); // E-posta alanının ID'sini doğru olarak ayarlayın
            WebElement passwordField = driver.findElement(By.id("password")); // Şifre alanının ID'sini doğru olarak ayarlayın
            WebElement submitButton = driver.findElement(By.id("login-submit-button")); // Giriş butonunun ID'sini doğru olarak ayarlayın

            // Geçersiz e-posta ve geçerli şifre ile giriş yapmayı dener
            emailField.sendKeys("invalid@example.com");
            passwordField.sendKeys("validPassword"); // Şifreyi uygun şekilde değiştirin
            submitButton.click();

            // 4. Giriş işleminin başarısız olduğunu kontrol etme
            WebElement errorMessage = driver.findElement(By.id("error-message")); // Hata mesajının ID'sini doğru olarak ayarlayın
            assertTrue("Giriş işlemi başarısız oldu, uygun hata mesajı gösterilmedi.",
                    errorMessage.isDisplayed() && errorMessage.getText().contains("Geçersiz e-posta veya şifre")); // Mesaj metnini uygun şekilde değiştirin
        }

        @Test
        public void tearDown() {
            // Testten sonra tarayıcıyı kapatma
            if (driver != null) {
                driver.quit();
            }
        }
    }



