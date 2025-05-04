package stepDefinition;

import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class LoginPage {
    @When("User successfully enters the login details")
    public void User_successfully_enters_the_login_details() throws InterruptedException {
        sendkeyusername();
        sendkeyspassword();
        clickloginbutton();

    }
    @When( "User clicks on new Registration button")
    public void  User_clicks_on_new_Registration_button(){
        newregistrationbtn();

    }
}
