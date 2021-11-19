public synchronized boolean isLoginFailureMessageVisible() {
    if (failureMessage.getCssValue("visibility").equals("visible")) {
        return true;
    }else {
        return false;
    }
}