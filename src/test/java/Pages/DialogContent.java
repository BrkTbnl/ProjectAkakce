package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent {
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

    @FindBy(xpath = "//input[@id =\"rngm\"]")
    public WebElement genderSelectBox;

    @FindBy(xpath = "//select[@id =\"locpr\"]")
    public WebElement citySelectBox;

    @FindBy(xpath = "//select[@id=\"locpr\"]/option[4]")
    public WebElement selectBoxAnkara;

    @FindBy(xpath = "//select[@id=\"locds\"]/option[4]")
    public WebElement districtSelectBox;

    @FindBy(xpath = "//select[@id=\"locds\"]/option[8]")
    public WebElement selectBoxCankaya;

    @FindBy(xpath = "//select[@id=\"bd\"]")
    public WebElement daySelectBox;

    @FindBy(xpath = "//select[@id=\"bd\"]/option[20]")
    public WebElement selectedDay;

    @FindBy(xpath = "//select[@id=\"bm\"]")
    public WebElement monthSelectBox;

    @FindBy(xpath = "//select[@id=\"bm\"]/option[3]")
    public WebElement selectedMonth;

    @FindBy(xpath = "//select[@id=\"by\"]")
    public WebElement yearSelectBox;

    @FindBy(xpath = "//select[@id=\"by\"]/[20]")
    public WebElement selectedYear;

    @FindBy(id = "rnufpca")
    public WebElement acceptButton;

    @FindBy(id= "rnufnee")
    public WebElement accept2Button;

    @FindBy(id= "rfb")
    public WebElement submitButton;


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
            case "selectBoxAnkara": return this.selectBoxAnkara;
            case "district": return this.districtSelectBox;
            case "selectBoxCankaya": return this.selectBoxCankaya;
            case "day": return this.daySelectBox;
            case "selectedDay": return this.selectedDay;
            case "month": return this.monthSelectBox;
            case "selectedMonth": return this.selectedMonth;
            case "year": return this.yearSelectBox;
            case "selectedYear": return this.selectedYear;
            case "acceptButton": return this.acceptButton;
            case "accept2Button": return this.accept2Button;
            case "submitButton": return this.submitButton;

        }
        return null;
    }




}
