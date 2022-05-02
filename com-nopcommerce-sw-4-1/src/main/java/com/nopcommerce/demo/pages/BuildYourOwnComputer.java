package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {
    By productText = By.xpath("//h2[@class='product-title']//a[text()='Build your own computer']");
    By processorMenu = By.xpath("//select[@name='product_attribute_1']");
    By ramMenu = By.xpath("//select[@name='product_attribute_2']");
    By hddButton = By.xpath("//input[@value='7']");
    By osButton = By.xpath("//input[@value='9']");
    By softwareBox = By.xpath("//input[@id='product_attribute_5_12']");
    By priceText = By.xpath("//div[@class='product-price']//span[text()='$1,475.00']");
    By addToCartButtonDesktop = By.xpath("//button[@id='add-to-cart-button-1']");
    By greenBarText = By.xpath("//p[text()='The product has been added to your ']");
    By crossSign = By.xpath("//span[@class='close']");
    By shoppingCart = By.xpath("//a[@class='ico-cart']");
    By goToCart = By.xpath("//button[text()='Go to cart']");


    public String getProductText() {
        return getTextFromElement(productText);
    }

    public void selectProcessor(String processor) {
        selectByVisibleTextFromDropDown(processorMenu, processor);
    }

    public void selectRam(String ram) {
        selectByVisibleTextFromDropDown(ramMenu, ram);
    }

    public void clickOnHddButton() {
        clickOnElement(hddButton);
    }

    public void clickOnOsButton() {
        clickOnElement(osButton);
    }

    public void clickOnSoftwareBox() {
        clickOnElement(softwareBox);
    }

    public String getPriceText(){
        return getTextFromElement(priceText);
    }

    public void clickOnAddToCartButtonDesktop(){
        clickOnElement(addToCartButtonDesktop);
    }

    public String getGreenBarText(){
        return getTextFromElement(greenBarText);
    }

    public void clickOnCrossSign(){
        clickOnElement(crossSign);
    }
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(shoppingCart);
    }
    public void clickOnGoToCart(){
        clickOnElement(goToCart);
    }


}
