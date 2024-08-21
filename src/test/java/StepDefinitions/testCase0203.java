package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class testCase0203 {
    DialogContent dc = new DialogContent();

    @And("user enters their current username and incorrect password{int}")
    public void userEntersTheirCurrentUsernameAndIncorrectPassword(int arg0) {
        dc.mySendKeys(dc.emailInputLoginPage,"testerBob@gmail.com");
        dc.mySendKeys(dc.passwordInputLoginPage,"");
    }

    @Then("an error message is displayed{int}")
    public void anErrorMessageIsDisplayed(int arg0) {
        dc.verifyContainsText(dc.alertBox,"Lütfen şifrenizi yazın.");
    }
}
