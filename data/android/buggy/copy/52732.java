@java.lang.Override
protected com.applitools.eyes.selenium.RectangleSize getViewportSize() {
    com.applitools.eyes.selenium.ArgumentGuard.isValidState(getIsOpen(), "Eyes not open");
    return driver.getDefaultContentViewportSize();
}