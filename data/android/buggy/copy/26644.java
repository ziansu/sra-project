public void stepFinished() {
    updateSessionIdIfKnown();
    takeEndOfStepScreenshotFor(net.thucydides.core.steps.SUCCESS);
    currentStepDone(net.thucydides.core.steps.SUCCESS);
    pauseIfRequired();
}