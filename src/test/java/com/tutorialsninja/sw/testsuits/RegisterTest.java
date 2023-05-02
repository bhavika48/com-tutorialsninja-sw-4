package com.tutorialsninja.sw.testsuits;


import com.tutorialsninja.sw.pages.AccountPage;
import com.tutorialsninja.sw.pages.HomePage;
import com.tutorialsninja.sw.pages.RegisterPage;
import com.tutorialsninja.sw.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    RegisterPage registerPage = new RegisterPage();
    AccountPage accountPage = new AccountPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        registerPage.getTextRegisterAccount();
        registerPage.enterRegistrationDetails();
        registerPage.selectYesRadioButton();
        registerPage.selectPrivacyCheckBox();
        registerPage.selectContinue();
        accountPage.getTextAccountHasBeenCreated();
        accountPage.selectAccountContinueButton();

    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        accountPage.selectAccountContinueButton();
        accountPage.selectMyOptionLogOut();
        String expectedMessage1 = "Account Logout";
        String actualMessage1 = accountPage.getTextAccountLogOut();
        Assert.assertEquals(actualMessage1, expectedMessage1);
        accountPage.selectContinue();

    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        homePage.selectMyAccount();
        accountPage.selectMyLoginAccount();
        accountPage.enterEmail();
        accountPage.enterPassword();
        accountPage.selectLoginButton();
        String expectedMessage1 = "My Account";
        String actualMessage1 = getTextFromElement(By.xpath("//h2[normalize-space()='My Account']"));
        Assert.assertEquals(expectedMessage1, actualMessage1);
        clickOnElement(By.xpath("//a[@class='list-group-item'][normalize-space()='My Account']"));
        selectMyAccountOptions("Logout");
        String expectedMessage2 = "Account Logout";
        String actualMessage2 = accountPage.getTitleAccountLogOut();
        Assert.assertEquals(expectedMessage2, actualMessage2);
        accountPage.selectContinue();
    }

}


