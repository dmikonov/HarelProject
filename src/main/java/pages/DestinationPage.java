package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DestinationPage {
    @FindBy(how = How.ID, using = "destination-0")
    public WebElement btn_USA;

    @FindBy(how = How.XPATH, using =  "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[3]/div/button")
    public WebElement btn_dates;
}
