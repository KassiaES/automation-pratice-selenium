package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    private WebDriver driver;

    @Test
    public void helloSelenium() {
        //https://www.selenium.dev/pt-br/documentation/webdriver/getting_started/install_drivers/
        System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationpratice.com/index.php");

        String currentUrl = driver.getCurrentUrl();
        String expect = "https://automationpratice.com/index.php";
        Assertions.assertEquals(expect, currentUrl);

        driver.quit();
    }


    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

}
