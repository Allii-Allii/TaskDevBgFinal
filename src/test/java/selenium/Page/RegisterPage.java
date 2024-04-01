package selenium.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "first_name")
    private WebElement firstName;

    @FindBy (id = "last_name")
    private WebElement lastName;




}
