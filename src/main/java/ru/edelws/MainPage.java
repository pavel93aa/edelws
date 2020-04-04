package ru.edelws;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePageFactory {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(@href, '/constructor/')]")
    WebElement CONSTRUCTOR;

    public void openMainPage() {
        driver.get("https://edelws.ru");
        System.out.println(driver.getCurrentUrl());
    }
}