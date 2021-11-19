public void checkRegion(com.applitools.eyes.selenium.By selector, boolean stitchContent) {
    this.stitchContent = stitchContent;
    if (stitchContent) {
        checkElement(selector);
    }else {
        checkRegion(selector);
    }
    this.stitchContent = false;
}