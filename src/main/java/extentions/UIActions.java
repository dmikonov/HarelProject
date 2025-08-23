package extentions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;

import java.time.format.DateTimeFormatter;

public class UIActions extends CommonOps {
    @Step("Click on the button")
    public static void click(WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Select a departure date")
    public static void selectDepDate(WebElement elem) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = departureDate.format(formatter);
        elem.sendKeys(formattedDate);
    }

    @Step("Select a return date")
    public static void selectRetDate(WebElement elem) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDateRet = returnDate.format(formatter);
        elem.sendKeys(formattedDateRet);
    }


}
