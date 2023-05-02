package com.tutorialsninja.sw.pages;


import com.tutorialsninja.sw.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    public void mouseHoverToDesktopsAndClick() {
        mouseHoverToElementAndClick(By.linkText("Desktops"));
    }

    public void selectShowAllDesktops() {
        clickOnElement(By.linkText("Show AllDesktops"));
    }

    public void mouseHoverToLaptopsAndNoteBooksAndClick() {
        mouseHoverToElementAndClick(By.xpath("//a[normalize-space()='Desktops']"));
    }

    public void selectShowAllLaptopsAndNoteBooks() {
        clickOnElement(By.linkText("Show AllLaptops & Notebooks"));
    }

    public void mouseHoverToComponentsAndClick() {
        mouseHoverToElementAndClick(By.xpath("//a[normalize-space()='Components']"));
    }

    public void selectShowAllComponents() {
        clickOnElement(By.linkText("Show AllComponents"));
    }

    public void selectMyAccount() {
        clickOnElement(By.xpath("//span[normalize-space()='My Account']"));
    }

    public void selectRegister() {
        selectMyAccountOptions("Register");
    }


}
