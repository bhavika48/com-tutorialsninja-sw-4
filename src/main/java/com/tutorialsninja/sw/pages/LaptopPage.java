package com.tutorialsninja.sw.pages;


import com.tutorialsninja.sw.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopPage extends Utility {

    public String getTitleLaptopsAndNoteBooks() {
        return getTextFromElement(By.xpath("//h2[normalize-space()='Laptops & Notebooks']"));
    }

    public void selectPriceHighToLow() {
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-sort']"), "Price (High > Low)");
    }

    public void selectMacBook() {
        clickOnElement(By.xpath("//a[normalize-space()='MacBook']"));
    }

    public String getTitleMacBook() {
        return getTextFromElement(By.xpath("//h1[normalize-space()='MacBook']"));
    }

    public void selectMacBookAddToCart() {
        clickOnElement(By.xpath("//button[@id='button-cart']"));
    }

    public String getTitleAddedMacBookToYourShoppingCart() {
        return getTextFromElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
    }

    public void closeShoppingCartMessage() {
        clickOnElement(By.xpath("//a[normalize-space()='shopping cart']"));
    }


}


