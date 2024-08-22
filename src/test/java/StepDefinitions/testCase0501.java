package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class testCase0501 {
    DialogContent dc = new DialogContent();

    @And("the user clicks on Delete My Account")
    public void theUserClicksOnDeleteMyAccount() {
        dc.myJSClick(dc.deleteMyAccountButton);
    }

    @And("the user enters invalid password")
    public void theUserEntersInvalidPassword() {
        dc.mySendKeys(dc.enterPasswordInput,"123qwe123");
    }

    @Then("An error message should be displayed")
    public void anErrorMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.alertBox,"Mevcut şifrenizi doğru girdiğinizden emin olun.");

    }
}
