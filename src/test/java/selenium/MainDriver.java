package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class MainDriver {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.dev.bg/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

   /* @AfterMethod
    public void tearDown(){

        driver.quit();
    }*/
}

