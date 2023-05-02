package com.tutorialsninja.sw.pages;

import com.tutorialsninja.sw.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {

    public String getTextDesktops() {
        return getTextFromElement(By.xpath("//h2[normalize-space()='Desktops']"));
    }

    public void selectProductsByDescendingOrder() {

        selectByVisibleTextFromDropDown(By.id("products-orderby"), "Name: Z to A");
    }

    public void selectProductsByAscendingOrder() {
        //Select Sort By position "Name: A to Z"
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (A - Z)");
    }

    public ArrayList<String> getProductsNameByDescendingOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//h4//a"));
        Collections.reverse(products);
        return products;
    }

    public ArrayList<String> getProductsNameByAscendingOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//h4//a"));
        Collections.sort(products, String.CASE_INSENSITIVE_ORDER);
        return products;
    }

    public ArrayList<String> getProductsNameByOriginalOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//h4//a"));
        return products;
    }

    public ArrayList<String> getActualProductsNameByOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//h4//a"));
        return products;
    }

    public void selectRequiredDateFormCalendar(String year, String month, String date) {
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    public void enterQuantity1() {
        sendTextToElement(By.name("quantity"), "1");
    }

    public void addToCart() {
        clickOnElement(By.xpath("//button[@id='button-cart']"));
    }

    public String getTextYouHaveAddedHpToCart() {
        return getTextFromElement(By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible"));
    }

    public void selectShoppingCart() {
        clickOnElement(By.xpath("//a[contains(text(),'shopping cart')]"));
    }


}
