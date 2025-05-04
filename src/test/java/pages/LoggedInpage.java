package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.Assert.assertEquals;
import static utility.BrowserDriver.driver;

public class LoggedInpage {
    public static String productcategoryformalshoes_xpath="//h3[@id='ShoeType' and text()='Formal Shoes']";
    public static String prouctcategorysportsshoes_xpath="//h3[@id='ShoeType' and text()='Sports']";
    public static String prouctcategorysneakers_xpath="//h3[@id='ShoeType' and text()='Sneakers']";
//h3[@id='ShoeType' and text()='Sneakers']


    public static void visibility_productcategoryformalshoes() throws InterruptedException {
        String actualproductfromal=driver.findElement(By.xpath(productcategoryformalshoes_xpath)).getText();
        assertEquals(actualproductfromal,"Formal Shoes");
    }
    public static void visibility_productcategorysports() throws InterruptedException {
        String actualproductsports=driver.findElement(By.xpath(prouctcategorysportsshoes_xpath)).getText();
        assertEquals(actualproductsports,"Sports");

    }
    public static void visibility_productcategorysneakers() throws InterruptedException {

        String actualproductsneakers=driver.findElement(By.xpath(prouctcategorysneakers_xpath)).getText();
        assertEquals(actualproductsneakers,"Sneakers");

    }
}

