package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static pages.Homepage.*;

public class Homepage {

    @Given("User navigates to the login page")
    public void user_nvaigate_to_the_login_page() throws InterruptedException {
        clickHambuger();
        clicksignlink();
    }
        @When("User navigates to the Online product page")
        public static void User_navigates_to_the_Online_product_page () throws InterruptedException {
            clickHambuger();

            clickononlineproduct();
        }
    }

