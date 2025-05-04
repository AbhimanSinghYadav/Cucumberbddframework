package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class Homepage extends BrowserDriver {
    //*[@id="menuToggle"]/input

    public static String hambugermenu_xpath="//*[@id=\"menuToggle\"]/input";
    public static String signinlink_xpath="//*[@id=\"menu\"]/a[2]/li";
    public static String onlineproductpage="//*[@id=\"menu\"]/a[3]/li";
    //*[@id="menu"]/a[2]/li
    public static void clickHambuger() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath(hambugermenu_xpath)).click();
    }
    public static void clicksignlink() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(signinlink_xpath)).click();
    }
    public static void clickononlineproduct() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(onlineproductpage)).click();
    }
}
