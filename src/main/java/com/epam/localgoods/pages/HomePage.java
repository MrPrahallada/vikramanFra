//package com.epam.localgoods.pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class HomePage extends BasePage {
//
//    @FindBy(xpath = "value=\"1\"")
//    private WebElement loginButton;
//
//    public HomePage(WebDriver driver) {
//        super(driver);
//        PageFactory.initElements(driver, this);
//    }
//
//    public void clickLogin() {
//        loginButton.click();
//    }
//
//    public boolean isHomePageDisplayed() {
//        return loginButton.isDisplayed();
//    }
//}
package com.epam.localgoods.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

     @FindBy(xpath = "value=\"1\"") // Replace with an actual element locator
    private WebElement homePageElement;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isHomePageDisplayed() {
        return homePageElement.isDisplayed();
    }
}

