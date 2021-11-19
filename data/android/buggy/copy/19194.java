public void stepStarted(final net.thucydides.core.steps.ExecutedStepDescription description) {
    recordStep(description);
    if (currentTestIsABrowserTest()) {
        takeInitialScreenshot();
    }
    updateSessionIdIfKnown();
}