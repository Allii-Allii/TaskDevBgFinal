package org.selenium;

import org.selenium.base.MainTest;
import org.testng.annotations.Test;
import org.selenium.page.Header;

public class Tests extends MainTest {
    Header header;


    @Test
    public void testRegistrationForm (){
        header = new Header(driver);
        header.navigateToRegistrationForm();






    }



}
