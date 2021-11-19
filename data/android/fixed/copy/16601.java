@org.testng.annotations.Test(groups = { "cPage" }, dependsOnMethods = { "cPage_verifyStayInfo" }, alwaysRun = true, timeOut = 10000)
public void cPage_verifyReservationCharges() throws java.lang.InterruptedException {
    if ((isOnHold) == true) {
        rpID = "OnHold";
    }
    bookingEngine.Reservation_confirmed.cPage_verifyReservationCharges(paymentProcessor, rpID, isFull, false, false, isPrivate, isChargeToAccount);
}