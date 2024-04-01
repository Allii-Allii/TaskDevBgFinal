package selenium;

import org.testng.annotations.Test;
import selenium.Page.Header;

public class Tests extends MainDriver {
    Header header;


    @Test
    public void testRegistrationForm (){
        header = new Header(driver);
        header.createAccountForUser();






    }



}
