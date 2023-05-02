package com.tutorialsninja.sw.pages;

import com.tutorialsninja.sw.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {


    public String getTextShoppingCart() {
        return getTextFromElement(By.xpath("//h1[contains(text(),'Shopping Cart')]"));
    }

    public void addMacBookQuantityTo2() {
        sendTextToElement(By.xpath("//input[@name='quantity']"), "2");
    }

    public void selectUpdateTab() {
        clickOnElement(By.xpath("//i[@class='fa fa-refresh']"));
    }

    public String getTextSuccessModifiesToShoppingCart() {
        return getTextFromElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
    }

    public String getTextTotalPrice£73745() {
        return getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]"));
    }

    public void selectMacBookProductCheckOut() {
        clickOnElement(By.xpath("//a[@class='btn btn-primary']"));
    }

    public String getTextCheckOut() {
        return getTextFromElement(By.xpath("//h1[normalize-space()='Checkout']"));
    }

    public String getTextNewCustomer() {
        return getTextFromElement(By.xpath("//h2[normalize-space()='New Customer']"));
    }

    public void selectGuestCheckOut() {
        clickOnElement(By.xpath("//input[@value='guest']"));
    }

    public void selectContinueTab() {
        clickOnElement(By.xpath("//input[@id='button-account']"));
    }

    public String getTextHPLP3065() {
        return getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a"));
    }


    public String getProduct21() {
        return getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]"));
    }

    public String getPrice7473() {
    return  getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]"));
    }
}





