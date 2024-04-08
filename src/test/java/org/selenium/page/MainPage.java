package org.selenium.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    @FindBy (css = ".cmplz-btn.cmplz-accept")
    private WebElement cookiesButton;

    public void clickCookiesButton (){
        cookiesButton.click();
    }

}
