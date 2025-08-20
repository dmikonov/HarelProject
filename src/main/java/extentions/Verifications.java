package extentions;


import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utilities.CommonOps;


public class Verifications extends CommonOps {
    @Step("Verify text in element")
    public static void verifyTextInElement(WebElement elem, String expectedString) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Assert.assertEquals(elem.getText(), expectedString);
    }

    @Step("Verify a title on the page")
    public static void verifyPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
