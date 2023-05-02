package com.tutorialsninja.sw.pages;

import com.tutorialsninja.sw.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    public void enterPersonalDetails() {
        sendTextToElement(By.xpath("//input[@id='input-payment-firstname']"), "Tom");
        sendTextToElement(By.xpath("//input[@id='input-payment-lastname']"), "Martin");
        sendTextToElement(By.xpath("//input[@id='input-payment-email']"), "tom123@gmail.com");
        sendTextToElement(By.xpath("//input[@id='input-payment-telephone']"), "03452344567");
        sendTextToElement(By.xpath("//input[@id='input-payment-address-1']"), "22 cecil road");
        sendTextToElement(By.xpath("//input[@id='input-payment-city']"), "London");
        sendTextToElement(By.xpath("//input[@id='input-payment-postcode']"), "TW2 3PT");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-payment-country']"), "United Kingdom");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-payment-zone']"), "Cornwall");
    }

    public void selectCheckOutContinue() {
        clickOnElement(By.xpath("//input[@id='button-guest']"));
    }

    public String getTextWarningPaymentMethodRequired() {
        return getTextFromElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
    }
}
