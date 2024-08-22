package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(100));
    public JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

    public void myClick(WebElement element) {

        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
    }

    public void mySendKeys(WebElement element, String text) {

        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void verifyContainsText(WebElement element, String text) {

        wait.until(ExpectedConditions.textToBePresentInElement(element,text));
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public void myJSClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        js.executeScript("arguments[0].click();", element);

    }


    public void scrollToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void mySelectBox(WebElement element, String VisibleText){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Select select = new Select(element);
        select.selectByVisibleText(VisibleText);
    }

    public void hoverOverElement(WebElement element) {
        Actions actions = new Actions(GWD.getDriver());
        actions.moveToElement(element).build().perform();
    }


}
