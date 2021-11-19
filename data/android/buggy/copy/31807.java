public void checkRegion(com.applitools.eyes.selenium.By selector, java.lang.String tag, boolean stitchContent) {
    if (stitchContent) {
        checkElement(selector, tag);
    }else {
        checkRegion(selector, tag);
    }
}