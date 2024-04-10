package org.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterForm extends BasePage {

    @FindBy (css = "#user-registration-form #fname")
    private WebElement fNameField;

    @FindBy (css = "#user-registration-form #lname")
    private WebElement lNameField;

    @FindBy (css = "#user-registration-form #email")
    private WebElement emailField;

    @FindBy (css = "#user-registration-form #password")
    private WebElement passField;

    @FindBy (css = "#user-registration-form #subscriber-register-consent")
    private WebElement checkMark;

    @FindBy (css = "#user-registration-form .btn.btn-size-1.cta-btn.d-inline-block.user-register-submit")
    private WebElement createProfileButton;

    @FindBy (css = "#user-registration-form #consent-error")
    private WebElement errorMassageCheckMark;

    public void enterFNameField (String fName){

        fNameField.sendKeys(fName);
    }

    public void enterLNameField (String lName){

        lNameField.sendKeys(lName);
    }

    public void enterEmailField (String email) {

        emailField.sendKeys(email);
    }

    public void enterPassField (String password) {

        passField.sendKeys(password);
    }

    public void clickCheck (){

        checkMark.click();
    }
    public void clickCrNewProfButton(){

        createProfileButton.click();
    }

    public String getPasswordFieldColor(){
        return
                passField.getCssValue("color");
    }

    public String getEmailFieldColor(){

        return emailField.getCssValue("color");
    }

    public String getErrorMassageCheckMark (){
        return errorMassageCheckMark.getText();
    }



















}
