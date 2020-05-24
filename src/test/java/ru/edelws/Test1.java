package ru.edelws;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavel\\IdeaProjects\\edelws\\chromedriver_83.0.4103.39.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void cleanUp() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void Test1() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        ConstructorPage constructor = new ConstructorPage(driver);
        mainPage.openMainPage();
        mainPage.CONSTRUCTOR.click();
        constructor.BUTTON_ADD_PROCESSOR.click();
        Thread.sleep(3000);
        constructor.BUTTON_ADD_PROCESSOR_MODEL.click();
        Thread.sleep(3000);
        constructor.BUTTON_ADD_TO_CART.click();
        Assert.assertEquals("сборка не возможна", constructor.MESSAGE.getText());
    }
}