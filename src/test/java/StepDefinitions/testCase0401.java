package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class testCase0401 {
    DialogContent dc = new DialogContent();

    @And("the user clicks on My Messages")
    public void theUserClicksOnMyMessages() {
        dc.myJSClick(dc.myMessageBoxButton);
    }

    @Then("their message box should be empty")
    public void theirMessageBoxShouldBeEmpty() {
        dc.verifyContainsText(dc.messageBoxInfo,"Listelenecek mesaj bulunamadı.");
    }
}
