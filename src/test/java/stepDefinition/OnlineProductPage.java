package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static junit.framework.Assert.assertEquals;
import static pages.OnlineProductPage.*;
import static utility.BrowserDriver.driver;

public class OnlineProductPage {

    @When("User clicks on formal Shoes drop down")
    public  void User_clicks_on_formal_Shoes_drop_down(){
        click_formalshoesdropdown();

    }
  //  User should be able to view the product
    @Then("User should be able to view the product")
    public void User_should_be_able_to_view_the_product(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        gettext_formalshoes_firstvalue();
      // String actualProductName = gettext_formalshoes_firstvalu();
        //assertEquals("Classic Cheltenham", actualProductName);
       // assertEquals("   Classic Cheltenham", actualProductName);
       // Assert.assertEquals("Classic Cheltenham",gettext_formalshoes_firstvalue());
        Assert.assertEquals("   Classic Cheltenham",gettext_formalshoes_firstvalue());




    }


}
