package selenium.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {
    @FindBy (id = "register-menu-surface")
    private WebElement createAccountButton;

    @FindBy (css = "#register-menu-surface [title=Потребител]")
    private WebElement createUserButton;

    public Header (WebDriver driver) {
        super(driver);
    }
    public void createAccountForUser (){
        createAccountButton.click();
        createUserButton.click();
    }
}
