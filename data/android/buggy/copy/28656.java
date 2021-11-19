private void setupLogAppender() {
    onScreenConsoleOutputDelegate = new OnScreenConsoleOutputDelegate(outputTextArea);
    onScreenConsoleOutputDelegate.setShowDebug(true);
    org.apache.log4j.Logger.getRootLogger().addAppender(onScreenConsoleOutputDelegate);
}