package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavigation extends Parent{
    public TopNavigation() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "(//a[text()=\"Hesap Aç\"])[1]")
    public WebElement createAccountButton;

    @FindBy(xpath = "(//a[text()=\"Giriş Yap\"])[1]")
    public WebElement loginButton;



    public WebElement getWebElement(String strElement) {
        switch (strElement){
            case "createAccount": return this.createAccountButton;
            case "loginButton": return this.loginButton;
        }
        return null;
    }
}
