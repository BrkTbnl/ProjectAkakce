package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNavigation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class testCase0102 {

    DialogContent dc = new DialogContent();

    @When("the user enters incomplete or incorrect information")
    public void theUserEntersIncompleteOrIncorrectInformation() {

        dc.mySendKeys(dc.nameInput,"bob");
        dc.mySendKeys(dc.emailInput,"testerBob@gmail.com");
        dc.mySendKeys(dc.reEmailInput,"testerBob@gmail.com");
        dc.mySendKeys(dc.passwordInput,"Password123");
        dc.mySendKeys(dc.rePasswordInput,"Password123");
        dc.myJSClick(dc.genderSelectBox);
        dc.mySelectBox(dc.citySelectBox,"İzmir");
        dc.wait.until(ExpectedConditions.visibilityOf(dc.selectBoxCheck));
        dc.mySelectBox(dc.districtSelectBox,"Bayraklı");
        dc.mySelectBox(dc.daySelectBox,"10");
        dc.mySelectBox(dc.monthSelectBox,"4");
        dc.mySelectBox(dc.yearSelectBox,"1993");
        dc.myJSClick(dc.acceptButton);
        dc.myJSClick(dc.accept2Button);
        dc.myJSClick(dc.submitButton);

    }

    @Then("an error message is displayed")
    public void anErrorMessageIsDisplayed() {
        dc.verifyContainsText(dc.alertBox,"Lütfen soyadınızı yazın");
    }
}
