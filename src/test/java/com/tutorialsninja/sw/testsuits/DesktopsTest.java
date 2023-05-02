package com.tutorialsninja.sw.testsuits;

import com.tutorialsninja.sw.pages.*;
import com.tutorialsninja.sw.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class DesktopsTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    LaptopPage laptopPage = new LaptopPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        homePage.mouseHoverToDesktopsAndClick();
        homePage.selectShowAllDesktops();
        Thread.sleep(3000);
        ArrayList<String> expectedProducts = desktopsPage.getProductsNameByAscendingOrder();

        desktopsPage.selectProductsByAscendingOrder();
        Thread.sleep(3000);
        ArrayList<String> actualProducts = desktopsPage.getActualProductsNameByOrder();
        Assert.assertEquals(actualProducts, expectedProducts);
        desktopsPage.selectRequiredDateFormCalendar("2022", "11", "30");
        desktopsPage.enterQuantity1();
        desktopsPage.addToCart();
        String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!";
        String ActualMessage = desktopsPage.getTextYouHaveAddedHpToCart();
        Assert.assertEquals(ActualMessage, expectedMessage);
        desktopsPage.selectShoppingCart();
        String expectedMessage1 = "Shopping Car";
        String ActualMessage1 = shoppingCartPage.getTextShoppingCart();
        Assert.assertEquals(ActualMessage1, expectedMessage1);
        String expectedMessage2 = " HP LP3065";
        String ActualMessage2 = shoppingCartPage.getTextHPLP3065();
        Assert.assertEquals(ActualMessage2, expectedMessage2);
        String expectedMessage3 = " Product21";
        String ActualMessage3 = shoppingCartPage.getProduct21();
        Assert.assertEquals(ActualMessage3, expectedMessage3);
        String expectedMessage4 = "74.73 ";
        String ActualMessage4 = shoppingCartPage.getPrice7473();
        Assert.assertEquals(ActualMessage4, expectedMessage4);


    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        homePage.mouseHoverToLaptopsAndNoteBooksAndClick();
        homePage.selectShowAllDesktops();
        laptopPage.selectPriceHighToLow();
        laptopPage.selectMacBook();
        laptopPage.getTitleMacBook();
        laptopPage.selectMacBookAddToCart();
        laptopPage.getTitleAddedMacBookToYourShoppingCart();
        laptopPage.closeShoppingCartMessage();
        String expectedMessage2 = "Shopping Cart";
        String actualMessage2 = shoppingCartPage.getTextShoppingCart();
        Assert.assertTrue(actualMessage2.contains(expectedMessage2));
        String expectedMessage3 = "MacBook";
        String actualMessage3 = laptopPage.getTitleMacBook();
        Assert.assertEquals(actualMessage3, expectedMessage3);
        shoppingCartPage.addMacBookQuantityTo2();
        shoppingCartPage.selectUpdateTab();
        String expectedMessage4 = "Success: You have modified your shopping cart!\n" +
                "    ";
        String actualMessage4 = shoppingCartPage.getTextSuccessModifiesToShoppingCart();
        Assert.assertEquals(actualMessage4, expectedMessage4);
        //  2.14 Verify the Total £737.45
        String expectedMessage = "£737.45";
        String actualMessage = shoppingCartPage.getTextTotalPrice£73745();
        Assert.assertEquals(actualMessage, expectedMessage);
        //  2.15 Click on “Checkout” button
        shoppingCartPage.selectMacBookProductCheckOut();
        // 2.16 Verify the text “Checkout”
        String expectedMessage5 = "Checkout";
        String actualMessage5 = shoppingCartPage.getTextCheckOut();
        Assert.assertEquals(actualMessage5, expectedMessage5);
//        2.17 Verify the Text “New Customer”
        String expectedMessage6 = "New Customer";
        String actualMessage6 = shoppingCartPage.getTextNewCustomer();
        Assert.assertEquals(actualMessage6, expectedMessage6);
//        2.18 Click on “Guest Checkout” radio button
        shoppingCartPage.selectGuestCheckOut();
//        2.19 Click on “Continue” tab
        shoppingCartPage.selectContinueTab();
        // 2.20 Fill the mandatory fields
        checkOutPage.enterPersonalDetails();
        checkOutPage.selectCheckOutContinue();
        // 2.25 Verify the message “Warning: Payment method required!”
        String expectedMessage7 = "Warning: Payment method required!";
        String actualMessage7 = checkOutPage.getTextWarningPaymentMethodRequired();
        Assert.assertEquals(expectedMessage7, actualMessage7);

    }
}