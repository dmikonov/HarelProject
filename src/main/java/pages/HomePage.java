package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='לרכישה בפעם הראשונה']")
    public WebElement btn_firstTimePurchase;
}
