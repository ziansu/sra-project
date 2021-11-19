public void checkRegion(com.applitools.eyes.selenium.By selector, boolean stitchContent) {
    if (stitchContent) {
        checkElement(selector);
    }else {
        checkRegion(selector);
    }
}