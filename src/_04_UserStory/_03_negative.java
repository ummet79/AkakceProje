package _04_UserStory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _03_negative {
    public static <WebElement> void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeOptions (Optional: Run in headless mode)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run Chrome in headless mode

        // Create WebDriver instance
        WebDriver driver = new ChromeDriver(options);

        try {
            // Open the website
            driver.get("https://www.akakce.com");

            // Wait for the Sign In button to be clickable and click it
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='sign-in-button']"))); // Adjust the XPath if needed
            signInButton.click();

            // Locate the email and password fields
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))); // Adjust the NAME attribute if needed
            WebElement passwordField = driver.findElement(By.name("password")); // Adjust the NAME attribute if needed

            // Enter invalid email and valid password
            emailField.sendKeys("invalid_username@example.com");
            passwordField.sendKeys("valid_password");

            // Click the "Sign In" button
            WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit-button']")); // Adjust the XPath if needed
            submitButton.click();

            // Wait for the error message to be visible
            WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='error-message']"))); // Adjust XPath if needed

            // Assert that the error message is displayed
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


