/*
package org.selenium.tests;

import com.opencsv.exceptions.CsvException;
import org.example.utils.CsvReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test1 {


    @DataProvider(name = "login-data")
    public static Object [][] dateProviderHardcodedData(){
        return new Object[][] {
                {"standard_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},
                {"visual_user", "secret_sauce"}
        };
    }
    @DataProvider(name = "login-data-file")
    public static Object [][] dateProviderFromCsvFile() throws IOException, CsvException {
        return CsvReader.readFile("src/test/resources/login-data");
    }

    @Test(dataProvider = "login-data")
    public void testSuccessfullLogin(String username, String password){



    }

}
Sing up кнопка на главной сцене (xpath //*[@class='HeaderMenu-link HeaderMenu-link--sign-up flex-shrink-0 d-none d-lg-inline-block no-underline border color-border-default rounded px-2 py-1'])
Куда ввводить мейл (".application-main.d-flex.flex-auto.flex-column #email")
Кнопка контин (//*[@id="email-container"]/div[2]/button)

Email is invalid or already taken - на проверку
Create a password* - (.d-flex.flex-items-center.flex-column.flex-sm-row #password)
continue button - //*[@id="password-container"]/div[2]/button

Password is too short
Password is strong
Можно вводить пароль не нажимат кнопку дальше и проверять на длиннсть и которкость пароля

Sign in - кнопка на главном екране //*[@class='HeaderMenu-link HeaderMenu-link--sign-in flex-shrink-0 no-underline d-block d-lg-inline-block border border-lg-0 rounded rounded-lg-0 p-2 p-lg-0']
Куда ввводить мейл css = .application-main  #login_field
куда вводить пароль css = .application-main  #password
Sing in button - css = .application-main  .btn.btn-primary.btn-block.js-sign-in-button

 */



