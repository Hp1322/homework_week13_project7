package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOut extends Utility {
    By welcomeToStoreText = By.xpath("//h2[text()='Welcome to our store']");
    By logOutLink = By.xpath("//a[text()='Log out']");

    public String getWelcomeToStoreText(){
        return getTextFromElement(welcomeToStoreText);
    }
    public void clickOnLogoutLink(){
        clickOnElement(logOutLink);
    }
}
