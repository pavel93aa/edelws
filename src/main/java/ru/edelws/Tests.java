package ru.edelws;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
    ChromeDriver driver = new ChromeDriver();

    @Before
    public void setUp() {
        System.out.println("setUp");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavel\\IdeaProjects\\edelws\\chromedriver.exe");
    }

    @After
    public void cleanUp() {
        if (driver != null) {
            System.out.println("cleanUp");
            driver.quit();
        }
    }


    @Test
    public void Test1() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://edelws.ru");
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.className("nav__link")).click();
        //driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/nav/ul/li[1]/div/a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.className("btn_add js-configurator-add")).click(); //не работает!
        Thread.sleep(3000);

    }


}






