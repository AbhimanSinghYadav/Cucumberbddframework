package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class OnlineProductPage extends BrowserDriver {

    public static String formalshoesdropdownclasss="/html/body/div[2]/center/div";
    public static String formalshoeswebtable="/html/body/div[2]";
    public static String formalshoeswebtabletr="/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static void click_formalshoesdropdown(){
   // driver.findElement(By.className(formalshoesdropdownclasss)).click();
        driver.findElement(By.xpath(formalshoesdropdownclasss)).click();
    }
   public static Object gettext_formalshoes_firstvalue(){
       return driver.findElement(By.xpath(formalshoeswebtabletr)).getText();


   }
}
