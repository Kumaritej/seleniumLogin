package org.example;
import org.junit.Test;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest
{

    @Test
    public void validLoginTest() {

        WebDriver driver = new ChromeDriver();

        // Open login.html

        driver.get("file:///C:/Users/lak11/IdeaProjects/seleniumLogin/login.html");

        // Enter username
        driver.findElement(By.id("username"))
                .sendKeys("admin");

        // Enter password
        driver.findElement(By.id("password"))
                .sendKeys("admin123");

        // Click Login
        driver.findElement(By.id("loginBtn"))
                .click();

        // Verify message
        String message = driver.findElement(By.id("message"))
                .getText();

        if(message.equals("Login Successful")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        driver.quit();
    }
}
