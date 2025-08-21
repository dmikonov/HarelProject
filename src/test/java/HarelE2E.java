import extentions.Verifications;
import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.HarelFlows;

@Listeners(utilities.Listeners.class)
public class HarelE2E extends CommonOps {
    @Test(description = "Test 01 - Verify Date and Moving to Travelers Page")
    @Description("This test verifies date selecting and moving to travelers page")
    public void test01_verifyDateAndMovingToTravelersPage() {
        HarelFlows.purchaseAndSelectDates();
        Verifications.verifyTextInElement(datesPage.totalDays, "סה\"כ: 30 ימים");
        HarelFlows.goToTravelers();
        Verifications.verifyPageTitle("מילוי פרטי הנוסעים | רכישת ביטוח נסיעות לחו\"ל");
    }
}
