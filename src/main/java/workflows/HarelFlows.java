package workflows;

import extentions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class HarelFlows extends CommonOps {
    @Step("Selecting purchase first time, select dates")
    public static void purchaseAndSelectDates(){
        UIActions.click(harelHome.btn_firstTimePurchase);
        UIActions.click(destinationPage.btn_USA);
        UIActions.click(destinationPage.btn_dates);
        UIActions.selectDepDate(datesPage.txt_departure);
        UIActions.selectRetDate(datesPage.txt_return);
    }
    @Step("Moving to travelers page")
    public static void goToTravelers(){
        UIActions.click(datesPage.btn_toTravelers);
    }

}
