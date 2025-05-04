package stepDefinition;

import io.cucumber.java.en.Then;

import static pages.RegistrationPage.visibility_userregistrationpage;

public class RegistrationPage {
    @Then("User should be able to view the Registration page")
    public void   User_should_be_able_to_view_the_Registration_page() throws InterruptedException {
        visibility_userregistrationpage();

    }
}
