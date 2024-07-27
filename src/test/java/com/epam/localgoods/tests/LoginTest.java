package com.epam.localgoods.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.epam.localgoods.pages.HomePage;
import com.epam.localgoods.pages.LoginPage;
import com.epam.localgoods.pages.AccountSignUpPage; // Ensure the correct package is imported

public class LoginTest {

    private RemoteWebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prahallada_v\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test(priority = 1)
    public void loginTest() {
        loginPage.login("Prahallada", "password");
    }

//    @Test(priority = 2)
//    public void signupTest() {
//        driver.get("https://www.facebook.com");
//
//
//        AccountSignUpPage signUpPage = new AccountSignUpPage(driver);
//
//        signUpPage.getFirstNameField().sendKeys("Prahallada");
//        signUpPage.getLastNameField().sendKeys("V");
//        signUpPage.getMobileEmailAddressField().sendKeys("prahallada@gmail.com");
//
//        signUpPage.selectDayOfBirth("21");
//        signUpPage.selectMonthOfBirth("Jun");
//        signUpPage.selectYearOfBirth("2000");
//
//        signUpPage.selectGender("male");
//
//        signUpPage.clickSignUpButton();
//
//        Assert.assertTrue(homePage.isHomePageDisplayed(), "Sign up successful");
//    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
