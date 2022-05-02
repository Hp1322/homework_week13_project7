package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class NokiaLumia extends Utility {
    By nokiaLumiaText = By.xpath("//h1[text()='Nokia Lumia 1020']");
    By nokiaPriceText = By.xpath("//div[@class='product-price']//span[text()=' $349.00 ']");
    By updateQuantity = By.xpath("//input[@aria-label='Enter a quantity']");
    By cartButton = By.xpath("//button[@id='add-to-cart-button-20']");
    By greenText = By.xpath("//p[text()='The product has been added to your ']");
    By cross = By.xpath("//span[@class='close']");
    By shoppingCart = By.xpath("//span[@class='cart-label']");
    By goToCart = By.xpath("//button[@class='button-1 cart-button']");

    public String getNokiaLumiaText(){
        return getTextFromElement(nokiaLumiaText);
    }
    public String getNokiaPriceText(){
        return getTextFromElement(nokiaPriceText);
    }
    public void clickToClearQuantity(){
        clearElementFromField(updateQuantity);
    }
    public void sendQuantity(String quantity){
        sendTextToElement(updateQuantity, quantity);
    }
    public String getGreenText(){
        return getTextFromElement(greenText);
    }
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(shoppingCart);
    }
    public void clickOnGoToCart(){
        clickOnElement(goToCart);
    }
    public void clickOnCartButton(){
        clickOnElement(cartButton);
    }
    public void clickOnCross(){
        clickOnElement(cross);
    }


}
