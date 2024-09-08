package _04_UserStory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _04_negative {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");


        WebDriver driver = new ChromeDriver(options);

        try {
            // Open the website
            driver.get("https://www.akakce.com");


            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='login-button']")));
            loginButton.click();


            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
            WebElement passwordField = driver.findElement(By.name("password"));




            WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit-button']"));
            submitButton.click();

            WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='error-message']"))); // Adjust XPath as needed


            if (errorMessage.isDisplayed()) {
                System.out.println("Test Passed: Error message is displayed.");
            } else {
                System.out.println("Test Failed: Error message is not displayed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
    }

