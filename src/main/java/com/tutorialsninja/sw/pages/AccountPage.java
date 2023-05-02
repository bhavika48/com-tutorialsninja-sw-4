package com.tutorialsninja.sw.pages;

import com.tutorialsninja.sw.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    public String getTextAccountHasBeenCreated() {
        return getTextFromElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']"));
    }

    public void selectAccountContinueButton() {
        clickOnElement(By.xpath("//a[normalize-space()='Continue']"));
    }

    public void selectMyOptionLogOut() {
        selectMyAccountOptions("Logout");
    }

    public void selectMyLoginAccount() {
        selectMyAccountOptions("Login");
    }

    public String getTextAccountLogOut() {
        return getTextFromElement(By.xpath("//h1[normalize-space()='Account Logout']"));
    }

    public void selectContinue() {
        clickOnElement(By.xpath("//a[normalize-space()='Continue']"));
    }

    public void enterEmail() {
        sendTextToElement(By.xpath("//input[@id='input-email']"), "jann123@gmail.com");
    }

    public void enterPassword() {
        sendTextToElement(By.xpath("//input[@id='input-password']"), "jann123");
    }

    public void selectLoginButton() {
        clickOnElement(By.xpath("//input[@value='Login']"));
    }

    public String getTitleAccountLogOut() {
        return getTextFromElement(By.xpath("//h1[normalize-space()='Account Logout']"));
    }
}
