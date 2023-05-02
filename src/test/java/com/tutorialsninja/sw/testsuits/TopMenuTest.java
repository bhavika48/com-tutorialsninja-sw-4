package com.tutorialsninja.sw.testsuits;

import com.tutorialsninja.sw.pages.ComponentsPage;
import com.tutorialsninja.sw.pages.DesktopsPage;
import com.tutorialsninja.sw.pages.HomePage;
import com.tutorialsninja.sw.pages.LaptopPage;
import com.tutorialsninja.sw.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    LaptopPage laptopPage = new LaptopPage();
    ComponentsPage componentsPage = new ComponentsPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        // 1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverToDesktopsAndClick();
        // 1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.selectShowAllDesktops();
        // 1.3 Verify the text ‘Desktops’
        String expectedMessage = "Desktops";
        String actualMessage = desktopsPage.getTextDesktops();
        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        // Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.mouseHoverToLaptopsAndNoteBooksAndClick();
        // 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.selectShowAllLaptopsAndNoteBooks();
        //.3 Verify the text ‘Laptops & Notebooks’
        String expectedMessage = "Laptops & Notebooks";
        String actualMessage = laptopPage.getTitleLaptopsAndNoteBooks();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        //  3.1 Mouse hover on “Components” Tab and click
        homePage.mouseHoverToComponentsAndClick();
        // 3.2 call selectMenu method and pass the menu = “Show All Components”
        homePage.selectShowAllComponents();
        //  3.3 Verify the text ‘Components’
        String expectedMessage = "Components";
        String actualMessage = componentsPage.getTitleComponents();
        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homePage.selectMyAccount();
        homePage.selectMyAccountOptions("Register");
        //1.3 Verify the text “Register Account”.
        String expectedMessage = "Register Account";
        String actualMessage = getTextFromElement(By.xpath("//h1[normalize-space()='Register Account']"));
        Assert.assertEquals(expectedMessage, actualMessage);

    }

}
