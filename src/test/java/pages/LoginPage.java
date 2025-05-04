package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {
    public static String username_text_id="usr";
    public static String password_text_id="pwd";
    public static String loginbutton_xpath="//*[@id=\"second_form\"]/input";
    public static String registration_xpath="//*[@id=\"NewRegistration\"]";


    public static void sendkeyusername() throws InterruptedException {

        driver.findElement(By.id("usr")).sendKeys("Scott.gale.gmail.com");
    }
    public static void sendkeyspassword() throws InterruptedException {
        driver.findElement(By.id("pwd")).sendKeys("Password");

    }
    public static void clickloginbutton(){

         driver.findElement(By.xpath(loginbutton_xpath)).click();
    }
    public static void newregistrationbtn(){

        driver.findElement(By.xpath(registration_xpath)).click();
    }

}

