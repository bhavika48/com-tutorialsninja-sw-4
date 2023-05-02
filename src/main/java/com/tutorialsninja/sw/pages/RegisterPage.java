package com.tutorialsninja.sw.pages;

import com.tutorialsninja.sw.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    public String getTextRegisterAccount() {
        return getTextFromElement(By.xpath("//h1[normalize-space()='Register Account']"));
    }

    public void enterRegistrationDetails() {
        sendTextToElement(By.xpath("//input[@id='input-firstname']"), "Jann");
        sendTextToElement(By.xpath("//input[@id='input-lastname']"), "olins");
        sendTextToElement(By.xpath("//input[@id='input-email']"), "jann123@gmail.com");
        sendTextToElement(By.xpath("//input[@id='input-telephone']"), "06783452345");
        sendTextToElement(By.xpath("//input[@id='input-password']"), "jann123");
        sendTextToElement(By.xpath("//input[@id='input-password']"), "jann123");
    }

    public void selectYesRadioButton() {
        clickOnElement(By.xpath("(//input[@name='newsletter'])[1]"));
    }

    public void selectPrivacyCheckBox() {
        clickOnElement(By.xpath("//input[@name='agree']"));
    }

    public void selectContinue() {
        clickOnElement(By.xpath("//input[@value='Continue']"));
    }



}
