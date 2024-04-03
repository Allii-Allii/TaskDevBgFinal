package org.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterForm extends BasePage {

    public RegisterForm(WebDriver driver) {

        super(driver);
    }

    @FindBy (css = "#user-registration-form #fname")
    private WebElement firstName;

    @FindBy (css = "#user-registration-form #lname")
    private WebElement lastName;

    @FindBy (css = "#user-registration-form #email")
    private WebElement email;

    @FindBy (css = "#user-registration-form #password")
    private WebElement password;

    @FindBy (css = "#user-registration-form #subscriber-register-quiz")
    private WebElement registerQuiz;





}
