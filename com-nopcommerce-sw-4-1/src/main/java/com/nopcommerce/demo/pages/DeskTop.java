package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DeskTop extends Utility {
    By sortByLink = By.xpath("//select[@aria-label='Select product sort order']");
    By priceOrderOriginal = By.xpath("//span[@class='price actual-price']");
    By addToCartButton = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]");

    //select sort by dropdown
    public void selectSortBy(String sortby){
        selectByVisibleTextFromDropDown(sortByLink, sortby);
    }

    //getting list of items
    public List<WebElement> fetchItemsList(){
        return listOfWebElementsList(priceOrderOriginal);
    }
    //click on add to cart
    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }




}
