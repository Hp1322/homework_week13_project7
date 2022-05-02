package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite extends TestBase {

    HomePage homePage = new HomePage();
    Computers computers = new Computers();
    DeskTop deskTop = new DeskTop();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    Cart cart = new Cart();
    CheckOutAsGuest checkOutAsGuest = new CheckOutAsGuest();
    Billing billing = new Billing();
    ShippingMethod shippingMethod = new ShippingMethod();
    PaymentMethod paymentMethod = new PaymentMethod();
    PaymentInfo paymentInfo = new PaymentInfo();
    ConfirmOrder confirmOrder = new ConfirmOrder();
    CheckOut checkOut = new CheckOut();

    @Test
    public void testName() throws InterruptedException {
        homePage.selectMenu("Computers");
        computers.clickOnDesktop();
        List<WebElement> originalList = deskTop.fetchItemsList();

        List<Double> expected = new ArrayList<>();

        for (WebElement data:originalList){
            String a = data.getText();
            String b = a.substring(1).replace(",", "");
            Double price = Double.valueOf(b);
            expected.add(price);

        }
        Collections.sort(expected);
        System.out.println(expected);
        Thread.sleep(1000);

        deskTop.selectSortBy("Price: Low to High");
        Thread.sleep(2000);
        List<WebElement> actualList = deskTop.fetchItemsList();

        List<Double> actual = new ArrayList<>();

        for (WebElement data:actualList) {
            String a = data.getText();
            String b = a.substring(1).replace(",", "");
            Double price = Double.valueOf(b);
            actual.add(price);
        }
        System.out.println(actual);
        Assert.assertEquals(actual, expected, "not sorted");

    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.selectMenu("Computers");
        computers.clickOnDesktop();
        deskTop.selectSortBy("Price: Low to High");
        Thread.sleep(1500);
        deskTop.clickOnAddToCartButton();
        Assert.assertEquals(buildYourOwnComputer.getProductText(), "Build your own computer", "not navigate to page");
        buildYourOwnComputer.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputer.selectRam("8GB [+$60.00]");
        buildYourOwnComputer.clickOnHddButton();
        buildYourOwnComputer.clickOnOsButton();
        buildYourOwnComputer.clickOnSoftwareBox();
        Assert.assertEquals(buildYourOwnComputer.getPriceText(), "$1,475.00", "not navigate to page");
        buildYourOwnComputer.clickOnAddToCartButtonDesktop();
        Assert.assertEquals(buildYourOwnComputer.getGreenBarText(), "The product has been added to your shopping cart", "not navigate to page");
        buildYourOwnComputer.clickOnCrossSign();
        buildYourOwnComputer.mouseHoverOnShoppingCart();
        buildYourOwnComputer.clickOnGoToCart();
        Assert.assertEquals(cart.getShoppingCartText(), "Shopping cart", "not navigate to page");
        cart.clearUpdateCart();
        cart.sendNumberToCart("2");
        cart.clickOnUpDateCartButton();
        Assert.assertEquals(cart.getTotalAmountText(), "$2,950.00", "not navigate to page");
        cart.clickOnCheckBoxTerms();
        cart.clickOnCheckOutButtonTotal();
        Assert.assertEquals(checkOutAsGuest.getWelcomeText(), "Welcome, Please Sign In!", "not navigate to page");
        checkOutAsGuest.clickOncheckOutAsGuest();
        billing.enterFirstName("Ram");
        billing.enterLastName("Shyam");
        billing.enterEmail("bam@gmail.com");
        billing.selectCountry("Belgium");
        billing.enterCityName("Rom");
        billing.enterAddress("12, B");
        billing.enterZipCode("110");
        billing.enterPhoneNumbers("999-990-000");
        billing.clickOnContinueButton();
        shippingMethod.clickOnRadioNextDayAir();
        shippingMethod.clickOnContinueButtonNextDayAir();
        paymentMethod.clickOnCreditCardButton();
        paymentMethod.clickOnCreditCardContinueButton();
        paymentInfo.selectCreditCardDropDown("Master card");
        paymentInfo.sendCardHolderName("Ram shyam");
        paymentInfo.sendCardNumber("5555555555554444");
        paymentInfo.selectExpireMonth("04");
        paymentInfo.selectExpireYear("2025");
        paymentInfo.sendCvvNumber("420");
        paymentInfo.clickOnContinueButtonPayment();
        Assert.assertEquals(confirmOrder.getCreditText(), "Credit Card", "Not navigate to page");
        Assert.assertEquals(confirmOrder.getNextDayText(), "Next Day Air", "Not navigate to page");
        Assert.assertEquals(confirmOrder.getTotalText(), "$2,950.00", "Not navigate to page");
        confirmOrder.clickOnConfirmButton();
        Assert.assertEquals(confirmOrder.getThankYouText(), "Thank you", "Not navigate to page");
        Assert.assertEquals(confirmOrder.getOrderSuccessFullText(), "Your order has been successfully processed!", "Not navigate to page");
        confirmOrder.clickOnContinueButtonFinal();
        Assert.assertEquals(checkOut.getWelcomeToStoreText(), "Welcome to our store", "Not navigate to page");








    }


}
