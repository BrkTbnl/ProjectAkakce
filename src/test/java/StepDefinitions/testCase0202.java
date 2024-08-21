package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class testCase0202 {
    DialogContent dc = new DialogContent();

    @And("user enters their current username and incorrect password")
    public void userEntersTheirCurrentUsernameAndIncorrectPassword() {
        dc.mySendKeys(dc.emailInputLoginPage,"testerBob@gmail.com");
        dc.mySendKeys(dc.passwordInputLoginPage,"Password");
    }

    @Then("an error message should be displayed")
    public void anErrorMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.alertBox,"Şifre doğru değil. Lütfen kontrol edip yeniden deneyin.");
    }
}
