package ru.edelws;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstructorPage extends BasePageFactory {

    public ConstructorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@data-block, 45)]")
    WebElement BUTTON_ADD_PROCESSOR;

    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div/div/div[1]/div[1]/div[4]/div[2]/div[2]/ul/li[1]/div/div[2]/a[1]")
    WebElement BUTTON_ADD_PROCESSOR_MODEL;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/div/div[1]/div[1]/div/div/div[2]/div/a")
    WebElement BUTTON_ADD_TO_CART;

    @FindBy(xpath = "/html/body/div[19]/div/div/div/div/div/div[1]/h2")
    WebElement MESSAGE;
}