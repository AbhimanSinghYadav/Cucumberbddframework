package pages;

import org.openqa.selenium.By;

import static junit.framework.Assert.assertEquals;
import static utility.BrowserDriver.driver;

public class RegistrationPage {
    public static String userregistration_xpath="/html/body/center/h1";


    public static void visibility_userregistrationpage() throws InterruptedException {
        String actualproductfromal=driver.findElement(By.xpath(userregistration_xpath)).getText();
        assertEquals(actualproductfromal,"User Registration Page");
    }
}
