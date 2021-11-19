private void cancelSelection() {
    if (com.vaadin.testbench.parallel.BrowserUtil.isFirefox(getDesiredCapabilities())) {
        findElement(com.vaadin.testbench.By.className("v-app")).click();
    }else {
        sendKeysToInput(Keys.ESCAPE);
    }
}