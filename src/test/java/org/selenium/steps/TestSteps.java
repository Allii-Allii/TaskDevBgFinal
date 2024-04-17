package org.selenium.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.selenium.page.LogIn;

import static org.testng.AssertJUnit.assertEquals;

public class TestSteps {

    private LogIn loginPage = new LogIn();

    @Given("remove cookies")
    public void removeCookies() {
        loginPage.mainPage().clickCookiesButton();
    }

    @Given("the user click Enter button")
    public void theUserClickEnterButton() {
        loginPage.header().clickEnterButton();
    }

    @Given("the user is logged in with username {string} and password {string}")
    public void theUserIsLoggedInWithUserNameAndPassword(String username, String password) {
    }

    @Given("the user set username {string}")
    public void theUserSetUsername(String username) {

        loginPage.enterLogin(username);
    }

    @Given("the user set password {string}")
    public void theUserSetPassword(String password) {

        loginPage.enterPassword(password);
    }

    @When("the user click Login Button")
    public void theUserClickLoginButton() {

        loginPage.clickLoginButton();
    }

    @Then("get error massage is {string}")
    public void getErrorMassageIs(String messageError) {

        assertEquals(loginPage.getErrorMassage(), messageError);
    }



}
