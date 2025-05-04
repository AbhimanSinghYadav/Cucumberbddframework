package stepDefinition;

import io.cucumber.java.en.Then;

import static pages.LoggedInpage.*;

public class LoggedInpage {
 @Then("User should be able to view the product category page")
    public void User_should_be_able_to_view_the_product_category_page() throws InterruptedException {
     visibility_productcategoryformalshoes();
     visibility_productcategorysports();
     visibility_productcategorysneakers();
 }
}
