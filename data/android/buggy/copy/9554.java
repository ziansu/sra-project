private void clickOnce() {
    aRobot.click();
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}