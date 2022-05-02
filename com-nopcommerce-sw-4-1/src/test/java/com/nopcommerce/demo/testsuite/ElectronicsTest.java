package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    HomePage homePage = new HomePage();
    CellPhones cellPhones = new CellPhones();
    NokiaLumia nokiaLumia = new NokiaLumia();
    Cart cart = new Cart();
    CheckOutAsGuest checkOutAsGuest = new CheckOutAsGuest();
    Register register = new Register();
    RegisterResult registerResult = new RegisterResult();
    ShippingMethod shippingMethod = new ShippingMethod();
    PaymentMethod paymentMethod = new PaymentMethod();
    PaymentInfo paymentInfo = new PaymentInfo();
    ConfirmOrder confirmOrder = new ConfirmOrder();
    CheckOut checkOut = new CheckOut();
    Billing billing = new Billing();

    @Test
    public void textVerified(){
        homePage.mouseHoverElectronics();
        homePage.mouseHoverAndClickOnCellPhones();
        Assert.assertEquals(cellPhones.getCellPhoneText(), "Cell phones", "not navigate to page");
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverElectronics();
        Thread.sleep(500);
        homePage.mouseHoverAndClickOnCellPhones();
        Thread.sleep(500);
        Assert.assertEquals(cellPhones.getCellPhoneText(), "Cell phones", "not navigate to page");
        cellPhones.clickOnListTab();
        Thread.sleep(1000);
        cellPhones.clickOnNokia();
        Assert.assertEquals(nokiaLumia.getNokiaLumiaText(), "Nokia Lumia 1020", "not navigate to page");
        Assert.assertEquals(nokiaLumia.getNokiaPriceText(), "$349.00", "not navigate to page");
        nokiaLumia.clickToClearQuantity();
        nokiaLumia.sendQuantity("2");
        nokiaLumia.clickOnCartButton();
        Assert.assertEquals(nokiaLumia.getGreenText(), "The product has been added to your shopping cart", "not navigate to page");
        nokiaLumia.clickOnCross();
        nokiaLumia.mouseHoverOnShoppingCart();
        nokiaLumia.clickOnGoToCart();
        Assert.assertEquals(cart.getShoppingCartText(), "Shopping cart", "not navigate to page");
        Assert.assertEquals(cart.sendAttributeQuantity("value"), "2", "not navigate to page");
        Assert.assertEquals(cart.getTotalAmountText(), "$698.00", "not navigate to page");
        cart.clickOnCheckBoxTerms();
        cart.clickOnCheckOutButtonTotal();
        Assert.assertEquals(checkOutAsGuest.getWelcomeText(), "Welcome, Please Sign In!", "not navigate to page");
        checkOutAsGuest.clickOnRegisterTab();
        Assert.assertEquals(register.getRegisterText(), "Register", "not navigate to page");
        register.sendFname("ram");
        register.sendLname("jam");
        register.sendEmailFill("jam");
        register.sendPassFill("123456");
        register.sendConfirmPassFill("123456");
        register.clickOnRegisterButton();
        Assert.assertEquals(registerResult.getRegistrationText(), "Your registration completed", "not navigate to page");
        registerResult.clickOnContinueButton();
        Assert.assertEquals(cart.getShoppingCartText(), "Shopping cart", "not navigate to page");
        cart.clickOnCheckBoxTerms();
        cart.clickOnCheckOutButtonTotal();
        billing.enterFirstName("Ram");
        billing.enterLastName("Shyam");
        billing.enterEmail("");
        billing.selectCountry("Belgium");
        billing.enterCityName("Rom");
        billing.enterAddress("12, B");
        billing.enterZipCode("110");
        billing.enterPhoneNumbers("999-990-000");
        billing.clickOnContinueButton();
        shippingMethod.clickOnRadio2ndDayAir();
        shippingMethod.clickOnContinueButtonNextDayAir();
        paymentMethod.clickOnCreditCardButton();
        paymentMethod.clickOnCreditCardContinueButton();
        paymentInfo.selectCreditCardDropDown("Visa");
        paymentInfo.sendCardHolderName("ram j");
        paymentInfo.sendCardNumber("4111111111111111");
        paymentInfo.selectExpireMonth("05");
        paymentInfo.selectExpireYear("2023");
        paymentInfo.sendCvvNumber("412");
        paymentInfo.clickOnContinueButtonPayment();
        Assert.assertEquals(confirmOrder.getCreditText(), "Credit Card", "not navigate to page");
        Assert.assertEquals(confirmOrder.getSecondDayText(), "2nd Day Air", "not navigate to page");
        Assert.assertEquals(confirmOrder.getTotalText(), "$698.00", "not navigate to page");
        confirmOrder.clickOnConfirmButton();
        Assert.assertEquals(confirmOrder.getThankYouText(), "Thank you", "not navigate to page");
        Assert.assertEquals(confirmOrder.getOrderSuccessFullText(), "Your order has been successfully processed!", "not navigate to page");
        confirmOrder.clickOnContinueButtonFinal();
        Assert.assertEquals(checkOut.getWelcomeToStoreText(), "Welcome to our store","not navigate to page");
        checkOut.clickOnLogoutLink();
        Assert.assertEquals(baseUrl, "https://demo.nopcommerce.com/", "not navigate to page");


    }
}
