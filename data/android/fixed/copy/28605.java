protected void waitUntilElementAvailable() {
    if (driverIsDisabled()) {
        return ;
    }
    withTimeoutOf(((int) (waitForTimeoutInMilliseconds)), java.util.concurrent.TimeUnit.MILLISECONDS).waitUntilEnabled();
}