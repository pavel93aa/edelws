package ru.edelws;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstructorPage extends BasePageFactory {

    public ConstructorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@data-block, 45)]")
    WebElement BUTTON_SELECT;

    @FindBy(xpath = "//a[@data-techid = '313398']")
    WebElement LINK;

    @FindBy(xpath = "//*[contains(@class, 'close_detail new_sprite new_sprite-big_close')]")
    WebElement LINK_CLOSE;

    @FindBy(xpath = "//*[contains(@data-product, '313398')]")
    WebElement BUTTON_ADD;

    public void openConstructor() {
        driver.get("https://edelws.ru/constructor/");
        System.out.println(driver.getCurrentUrl());
    }
}
