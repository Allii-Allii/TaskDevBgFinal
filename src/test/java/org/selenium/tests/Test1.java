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
