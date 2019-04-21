package ru.edelws;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavel\\IdeaProjects\\edelws\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("setUp");
    }

    @After
    public void cleanUp() {
        if (driver != null) {
            driver.quit();
            System.out.println("cleanUp");
        }
    }

    @Test
    public void Test1() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        ConstructorPage constructor = new ConstructorPage(driver);
        mainPage.openMainPage();
        mainPage.CONSTRUCTOR.click();
        constructor.BUTTON_SELECT.click();
        Thread.sleep(3000);
        constructor.LINK.click();
        Thread.sleep(3000);
        constructor.LINK_CLOSE.click();
        Thread.sleep(3000);
        constructor.BUTTON_ADD.click();
        Thread.sleep(3000);
    }
}
