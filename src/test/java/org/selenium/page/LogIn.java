package org.selenium.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends BasePage {

    @FindBy (css = "#subscriber-login #username")
    private WebElement loginField;

    @FindBy (css = "#subscriber-login #login-password")
    private WebElement passwordField;

    @FindBy (css = "#subscriber-login .button.button-primary.login-submit")
    private WebElement loginButton;

    @FindBy (css = "#subscriber-login .status")
    private WebElement errorMessageWrongEmail;

    @FindBy (xpath = "//*[@id='subscriber-login']/p[contains (text(), 'Моля изчакайте...')]")
    private WebElement errorMassageWaiter;

    public void enterLogin (String login){
        loginField.sendKeys(login);
    }
    public void enterPassword (String password) {
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();

    }
    public String getErrorMassage(){

        waitForElementToBeInvisible(errorMassageWaiter);
        return errorMessageWrongEmail.getText();
    }

    public Header header () {
        return new Header();
    }
}
