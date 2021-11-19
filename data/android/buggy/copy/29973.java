public void closeContainer() {
    if (storyboard.hasCurrentContainer()) {
        takeFinalScreenshotForExample("Completed");
    }
    storyboard.closeContainer();
    resetCurrentState();
}