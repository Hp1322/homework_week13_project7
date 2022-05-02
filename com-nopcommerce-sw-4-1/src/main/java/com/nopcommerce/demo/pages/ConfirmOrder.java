package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ConfirmOrder extends Utility {
    By creditText = By.xpath("//span[contains(text(),'Credit Card')]");
    By nextDayText = By.xpath("//li[@class='shipping-method']//span[contains(text(),'Next Day Air')]");
    By secondDayText = By.xpath("//li[@class='shipping-method']//span[contains(text(),'2nd Day Air')]");
    By totalText = By.xpath("//td[@class='cart-total-right']//span[@class='value-summary']//strong");
    By confirmButton = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By thankYouText = By.xpath("//h1[text()='Thank you']");
    By orderSuccessFullText = By.xpath("//strong[text()='Your order has been successfully processed!']");
    By continueButtonFinal = By.xpath("//button[@class='button-1 order-completed-continue-button']");


    public String getCreditText(){
        return getTextFromElement(creditText);
    }
    public String getNextDayText(){
        return getTextFromElement(nextDayText);
    }
    public String getSecondDayText(){
        return getTextFromElement(secondDayText);
    }
    public String getTotalText(){
        return getTextFromElement(totalText);
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
    public String getThankYouText(){
        return getTextFromElement(thankYouText);
    }
    public String getOrderSuccessFullText(){
        return getTextFromElement(orderSuccessFullText);
    }
    public void clickOnContinueButtonFinal(){
        clickOnElement(continueButtonFinal);
    }


}
