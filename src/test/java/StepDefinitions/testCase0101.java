package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNavigation;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class testCase0101 {
    TopNavigation tn = new TopNavigation();
    DialogContent dc = new DialogContent();

    @Given("navigate to akakce.com")
    public void navigateToAkakceCom() {
        GWD.getDriver().get("https://www.akakce.com");
    }

    @And("Click on create account")
    public void clickOnCreateAccount() {
        tn.myJSClick(tn.createAccountButton);
    }

    @When("enter all required information and click Submit")
    public void enterAllRequiredInformationAndClickSubmit() throws InterruptedException {

        dc.mySendKeys(dc.nameInput,"bob");
        dc.mySendKeys(dc.lastNameInput,"tester");
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

    @Then("relocate to main page logged in.")
    public void relocateToMainPageLoggedIn() {
        tn.verifyContainsText(tn.userNameLabel,"Bob");
    }
}
