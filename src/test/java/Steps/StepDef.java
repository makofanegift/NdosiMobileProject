package Steps;


import Screens.NdosiLoginScreen;
import Utils.AppiumDriverFactory;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.*;

public class StepDef {

    AppiumDriver driver;
    NdosiLoginScreen ndosiLoginScreen;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        AppiumDriverFactory.getInstanceOfAppiumDriverFactory(System.getProperty("user.dir") + "/src/main/Apps/app-qa-release.apk");
        this.ndosiLoginScreen = new NdosiLoginScreen(AppiumDriverFactory.getDriver());
        Thread.sleep(5000);

    }

    @And("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {

    }

    @And("the user enters the valid username (.*)$")
    public void the_user_enters_the_valid_username_user1(String username) {

    }

    @And("the user enters valid password (.*)$")
    public void the_user_enters_valid_password_pass1(String password) {

    }

    @When("the user clicks the Submit button")
    public void the_user_clicks_the_submit_button() {

    }

    @Then("Welcome message should be displayed")
    public void welcome_message_should_be_displayed() {

    }
}
