package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    Computers computers = new Computers();
    Electronics electronics = new Electronics();
    Apparel apparel = new Apparel();
    Digital digital = new Digital();
    Books books = new Books();
    Jewelry jewelry = new Jewelry();
    GiftCards giftCards = new GiftCards();

    @Test
    public void verifyPageNavigation(){
        homePage.selectMenu("Computers");
        Assert.assertEquals(computers.getPageHeader(), "Computers", "Not on correct page");
        System.out.println("User is on correct page : Computers");

        homePage.selectMenu("Electronics");
        Assert.assertEquals(electronics.getPageHeader(), "Electronics", "Not on correct page");
        System.out.println("User is on correct page : Electronics");

        homePage.selectMenu("Apparel");
        Assert.assertEquals(apparel.getPageHeader(), "Apparel", "Not on correct page");
        System.out.println("User is on correct page : Apparel");

        homePage.selectMenu("Digital downloads");
        Assert.assertEquals(digital.getPageHeader(), "Digital downloads", "Not on correct page");
        System.out.println("User is on correct page : Digital downloads");

        homePage.selectMenu("Books");
        Assert.assertEquals(books.getPageHeader(), "Books", "Not on correct page");
        System.out.println("User is on correct page : Books");

        homePage.selectMenu("Jewelry");
        Assert.assertEquals(jewelry.getPageHeader(), "Jewelry", "Not on correct page");
        System.out.println("User is on correct page : Jewelry");

        homePage.selectMenu("Gift Cards");
        Assert.assertEquals(giftCards.getPageHeader(), "Gift Cards", "Not on correct page");
        System.out.println("User is on correct page : Gift Cards");


        }

    }

