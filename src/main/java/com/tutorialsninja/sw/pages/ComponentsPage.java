package com.tutorialsninja.sw.pages;

import com.tutorialsninja.sw.utilities.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {

    public String getTitleComponents() {
        return getTextFromElement(By.xpath("//h2[normalize-space()='Components']"));
    }
}
