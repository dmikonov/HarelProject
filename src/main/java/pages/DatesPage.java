package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.Base;


public class DatesPage extends Base {
    @FindBy(how = How.XPATH, using = "//input[contains(@name,'start') or contains(@id,'start') or @aria-label='תאריך יציאה' or @placeholder='תאריך יציאה']")
    public WebElement txt_departure;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'end') or contains(@id,'end') or @aria-label='תאריך חזרה' or @placeholder='תאריך חזרה']")
    public WebElement txt_return;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/span")
    public WebElement totalDays;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='הלאה לפרטי הנוסעים' or contains(.,'הלאה לפרטי הנוסעים')]")
    public WebElement btn_toTravelers;


}
