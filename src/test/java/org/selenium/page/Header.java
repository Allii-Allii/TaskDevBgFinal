package org.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {
    @FindBy(css = ".button.bold.subscriber-register-btn")
    private WebElement createAccountButton;

    @FindBy(css = ".button.secondary.bold.subscriber-login-btn")
    private WebElement enterButton;

    @FindBy (xpath = "//*[@id='menu-item-9962']/a[contains (text(), 'Обяви')]")
    private WebElement Ob;

    @FindBy (xpath = "//*[@id='menu-item-106635']/a[contains (text(), 'IT обяви Варна')]")
    private WebElement ruse;

    public void navigateToRegistrationForm() {
        createAccountButton.click();
    }

    public void clickEnterButton() {
        enterButton.click();


    }


    public void navigateToRuse() {
        hoverElement(Ob);
        ruse.click();
    }

}
