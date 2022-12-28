package ru.netology.web;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium {
    private WebDriver driver;
    @BeforeAll
    static  void setUpAll() {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
    }
@BeforeEach
    void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @AfterEach

    void tearDown(){
        driver.quit();
        driver=null;

    }

    @Test
    void test () {
        driver.get("http://localhost:9999");
        driver.findElement(By.className("input__control")).sendKeys("Задорин Илья");
        driver.findElement(By.className("input__control")).sendKeys("+79124112556");
        driver.findElement(By.className("input__control")).click();
        driver.findElement(By.className("input__control")).click();
        String text = driver.findElement(By.className()).getText();


    }
}
