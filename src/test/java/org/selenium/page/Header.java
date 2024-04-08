package org.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {
    @FindBy(css = ".button.bold.subscriber-register-btn")
    private WebElement createAccountButton;

    public void navigateToRegistrationForm() {

        createAccountButton.click();
    }
}
