package org.selenium.tests;

import org.selenium.base.MainTest;
import org.selenium.page.MainPage;
import org.selenium.page.RegisterForm;
import org.testng.annotations.Test;
import org.selenium.page.Header;
import org.testng.asserts.SoftAssert;

public class Tests extends MainTest {
    Header header;
    RegisterForm registration;

    MainPage mainPage;


    @Test
    public void testRegistrationForm (){

        mainPage = new MainPage();
        mainPage.clickCookiesButton();

        header = new Header();
        header.navigateToRegistrationForm();
        registration = new RegisterForm();
        registration.enterFNameField("Alina");
        registration.enterLNameField("Antipova");
        registration.clickCrNewProfButton();

        SoftAssert soft = new SoftAssert();
        soft.assertEquals(registration.getEmailFieldColor(), "rgba(89, 89, 89, 1)");
        soft.assertEquals(registration.getPasswordFieldColor(), "rgba(89, 89, 89, 1)");
        soft.assertEquals(registration.getErrorMassageCheckMark(), "Трябва да се съгласите с условията, преди да се регистрирате");
        soft.assertAll();
    }
}
