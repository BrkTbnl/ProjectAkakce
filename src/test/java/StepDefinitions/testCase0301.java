package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNavigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class testCase0301 {
    TopNavigation tn = new TopNavigation();
    DialogContent dc = new DialogContent();

    @When("the user clicks on My Account")
    public void theUserClicksOnMyAccount() {
        tn.hoverOverElement(tn.menuBar);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.myAccountButton));
        dc.myJSClick(dc.myAccountButton);
    }

    @And("the user clicks on My Orders")
    public void theUserClicksOnMyOrders() {
        dc.myJSClick(dc.myOrdersButton);
    }

    @Then("their order history should be empty")
    public void theirOrderHistoryShouldBeEmpty() {
        dc.verifyContainsText(dc.myOrderInfo,"Kayıtlı siparişiniz bulunmuyor.");
    }
}
