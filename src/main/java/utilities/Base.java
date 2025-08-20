package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;


public class Base {
    protected static WebDriverWait wait;
    protected static WebDriver driver;

    protected static pages.HomePage harelHome;
    protected static pages.DestinationPage destinationPage;
    protected static pages.DatesPage datesPage;

    protected static LocalDate departureDate = LocalDate.now().plusDays(7);
    protected static LocalDate returnDate = departureDate.plusDays(29);


}
