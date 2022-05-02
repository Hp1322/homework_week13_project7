package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Cart extends Utility {
    By shoppingCartText = By.xpath("//h1[text()='Shopping cart']");
    By updateCart = By.xpath("//input[@class='qty-input']");
    By updateCartButton = By.xpath("//button[@id='updatecart']");
    By totalAmountText = By.xpath("//td[@class='subtotal']");
    By checkBoxTerms = By.xpath("//input[@id='termsofservice']");
    By checkOutButtonTotal = By.xpath("//button[@id='checkout']");
    By welcomeText = By.xpath("//h1[text()='Welcome, Please Sign In!']");

    public String getShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public void clearUpdateCart() {
        clearElementFromField(updateCart);
    }

    public void sendNumberToCart(String number) {
        sendTextToElement(updateCart, number);
    }

    public void clickOnUpDateCartButton() {
        clickOnElement(updateCartButton);
    }

    public String getTotalAmountText() {
        return getTextFromElement(totalAmountText);
    }

    public void clickOnCheckBoxTerms() {
        clickOnElement(checkBoxTerms);
    }

    public void clickOnCheckOutButtonTotal() {
        clickOnElement(checkOutButtonTotal);
    }

    public String sendAttributeQuantity(String atr){
        return sendAttributeValue(updateCart,atr);
    }
}
