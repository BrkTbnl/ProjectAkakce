package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavigation extends Parent{
    public TopNavigation() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "//div[@id=\"H_rl_v8\"]/a[1]")
    public WebElement createAccountButton;

    @FindBy(xpath = "//div[@id=\"H_rl_v8\"]/a[2]")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@id=\"HM_v8\"]/i/a")
    public WebElement userNameLabel;

    @FindBy(xpath = "//a[@id=\"H_a_v8\"]")
    public WebElement menuBar;



    public WebElement getWebElement(String strElement) {
        switch (strElement){
            case "createAccount": return this.createAccountButton;
            case "loginButton": return this.loginButton;
            case "userNameLabel": return this.userNameLabel;
        }
        return null;
    }
}
