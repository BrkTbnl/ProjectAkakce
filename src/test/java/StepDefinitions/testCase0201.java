package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNavigation;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class testCase0201 {

    TopNavigation tn = new TopNavigation();
    DialogContent dc = new DialogContent();

    @When("click on log-in button")
    public void clickOnLogInButton() {
        tn.myJSClick(tn.loginButton);
    }

    @And("user enters their current username and password")
    public void userEntersTheirCurrentUsernameAndPassword() {
        dc.mySendKeys(dc.emailInputLoginPage,"testerBob@gmail.com");
        dc.mySendKeys(dc.passwordInputLoginPage,"Password123");
    }

    @And("clicks the login button")
    public void clicksTheLoginButton() {
        dc.myJSClick(dc.loginButton);
    }

    @When("click on log-out button")
    public void clickOnLogOutButton() {
        tn.hoverOverElement(tn.menuBar);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.logoutButton));
        tn.myJSClick(dc.logoutButton);
    }

    @Then("the user should be redirected to the main page")
    public void theUserShouldBeRedirectedToTheMainPage() {
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(), "https://www.akakce.com/");
    }
}
