package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class testCase0502 {
    DialogContent dc = new DialogContent();


    @And("the user enters correct password and click confirm button")
    public void theUserEntersCorrectPasswordAndClickConfirmButton() {
        dc.mySendKeys(dc.enterPasswordInput,"Password123");

    }

    @Then("Account Deleted Message displayed")
    public void accountDeletedMessageDisplayed() {
        dc.verifyContainsText(dc.deleteAccMessage,"Hesabın silindi.");
    }
}
