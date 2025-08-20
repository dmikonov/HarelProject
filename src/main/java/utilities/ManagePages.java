package utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base {
    public static void initHarel() {
        harelHome = PageFactory.initElements(driver, pages.HomePage.class);
        destinationPage = PageFactory.initElements(driver, pages.DestinationPage.class);
        datesPage = PageFactory.initElements(driver, pages.DatesPage.class);
    }
}
