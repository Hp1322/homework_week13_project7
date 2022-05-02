package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhones extends Utility {
    By cellPhoneText = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listTab = By.xpath("//a[@class='viewmode-icon list']");
    By nokiaLumia = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]");

    public String getCellPhoneText(){
        return getTextFromElement(cellPhoneText);
    }
    public void clickOnListTab(){
        clickOnElement(listTab);
    }
    public void clickOnNokia(){
        clickOnElement(nokiaLumia);
    }

}
