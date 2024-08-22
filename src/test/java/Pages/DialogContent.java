package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{
    public DialogContent(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id =\"rnufn\"]")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@id =\"rnufs\"]")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@id =\"rnufe1\"]")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id =\"rnufe2\"]")
    public WebElement reEmailInput;

    @FindBy(xpath = "//input[@id =\"rnufp1\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@id =\"rnufp2\"]")
    public WebElement rePasswordInput;

    @FindBy(xpath = "//*[text()=\" Erkek\"]")
    public WebElement genderSelectBox;

    @FindBy(xpath = "//select[@id =\"locpr\"]")
    public WebElement citySelectBox;

    @FindBy(xpath = "//select[@id=\"locds\"]")
    public WebElement districtSelectBox;

    @FindBy(xpath = "//select[@id=\"bd\"]")
    public WebElement daySelectBox;

    @FindBy(xpath = "//select[@id=\"bm\"]")
    public WebElement monthSelectBox;

    @FindBy(xpath = "//select[@id=\"by\"]")
    public WebElement yearSelectBox;

    @FindBy(id = "rnufpca")
    public WebElement acceptButton;

    @FindBy(id= "rnufnee")
    public WebElement accept2Button;

    @FindBy(id= "rfb")
    public WebElement submitButton;

    @FindBy(xpath = "(//*[text()=\"Seçin\"])[2]")
    public WebElement selectBoxCheck;

    @FindBy(xpath = "//div[@class=\"alertX t2\"]")
    public WebElement alertBox;

    @FindBy(xpath = "//input[@id=\"life\"]")
    public WebElement emailInputLoginPage;

    @FindBy(xpath = "//input[@id=\"lifp\"]")
    public WebElement passwordInputLoginPage;

    @FindBy(xpath = "//input[@id=\"lfb\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@href=\"#Çık\"]")
    public WebElement logoutButton;

    @FindBy(xpath = "//a[@href=\"/akakcem/\"]")
    public WebElement myAccountButton;

    @FindBy(xpath = "(//ul[@id=\"AL\"]/li/a[1])[1]")
    public WebElement myOrdersButton;

    @FindBy(xpath = "(//ul[@id=\"AL\"]/li/a[2])[1]")
    public WebElement myMessageBoxButton;

    @FindBy(xpath = "//div[@id=\"user-order-info\"]/div")
    public WebElement myOrderInfo;

    @FindBy(xpath = "//div[@class=\"wbb_v8\"]/p")
    public WebElement messageBoxInfo;

    @FindBy(xpath = "//ul[@id=\"AL\"]/li/a[4]")
    public WebElement deleteMyAccountButton;

    @FindBy(xpath = "//input[@id=\"p\"]")
    public WebElement enterPasswordInput;




    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "name": return this.nameInput;
            case "lastname": return this.lastNameInput;
            case "email": return this.emailInput;
            case "reEmail": return this.reEmailInput;
            case "password": return this.passwordInput;
            case "rePassword": return this.rePasswordInput;
            case "gender": return this.genderSelectBox;
            case "city": return this.citySelectBox;
            case "district": return this.districtSelectBox;
            case "day": return this.daySelectBox;
            case "month": return this.monthSelectBox;
            case "year": return this.yearSelectBox;
            case "acceptButton": return this.acceptButton;
            case "accept2Button": return this.accept2Button;
            case "submitButton": return this.submitButton;
            case "selectBoxCheck": return this.selectBoxCheck;

        }
        return null;
    }




}
