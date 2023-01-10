package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.fail;

public class LoginTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() throws Exception {
        System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationpratice.com/index.php");
    }

    @AfterEach
    void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    void test() {
        WebElement emailAdressLocator = driver.findElement(By.id("email"));
        emailAdressLocator.sendKeys("kassiaes@gmail.com");
    }

}
