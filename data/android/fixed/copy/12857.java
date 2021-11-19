public void checkRegion(com.applitools.eyes.selenium.WebElement element, boolean stitchContent) {
    this.stitchContent = stitchContent;
    if (stitchContent) {
        checkElement(element);
    }else {
        checkRegion(element);
    }
    this.stitchContent = false;
}