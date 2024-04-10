package org.selenium.tests;

import com.opencsv.exceptions.CsvException;
import org.example.utils.CsvReader;
import org.selenium.base.MainTest;
import org.selenium.page.LogIn;
import org.selenium.page.MainPage;
import org.selenium.page.RegisterForm;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.selenium.page.Header;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class Tests extends MainTest {
    Header header;
    RegisterForm registration;

    LogIn logIn;

    MainPage mainPage;


    @Test
    public void testRegistrationForm() {

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

    @DataProvider(name = "fail-login-data-file")
    public static Object[][] dateProviderFromCsvFile() throws IOException, CsvException {
        return CsvReader.readFile("src/test/resources/login-fail.csv");
    }

    @Test(dataProvider = "fail-login-data-file")
    public void testWrongEmailOrPassword(String login, String password, String messageError) {
        mainPage = new MainPage();
        mainPage.clickCookiesButton();

        header = new Header();
        header.clickEnterButton();

        logIn = new LogIn();
        logIn.enterLogin(login);
        logIn.enterPassword(password);
        logIn.clickLoginButton();

        assertEquals(logIn.getErrorMassage(), messageError);
    }
}
