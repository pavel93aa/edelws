package ru.edelws;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@href, '/constructor/')]")
    WebElement CONSTRUCTOR;

    @FindBy(xpath = "//div[contains(@data-block, 45)]")
    WebElement BUTTON;

    @FindBy(xpath = "//a[@data-techid = '297743']")
    WebElement LINK;

    public void openMainPage() {
        driver.get("https://edelws.ru");
        System.out.println(driver.getCurrentUrl());
    }
}
