@org.testng.annotations.Test(groups = { "cPage" }, dependsOnMethods = { "cPage_verifyLinks" }, alwaysRun = true, timeOut = 10000)
public void cPage_getConfirmationNumber() throws java.io.IOException, java.lang.InterruptedException {
    if (isOnHold = true) {
        rpID = "OnHold";
    }
    bookingEngine.Reservation_confirmed.cPage_getConfirmationNumber(rpID);
}