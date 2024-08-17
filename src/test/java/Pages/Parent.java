package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
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


}
