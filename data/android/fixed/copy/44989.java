@com.google.common.eventbus.Subscribe
private void handleShowHelpEvent(seedu.doit.commons.events.ui.ShowHelpRequestEvent event) {
    seedu.doit.ui.UiManager.logger.info(seedu.doit.commons.core.LogsCenter.getEventHandlingLogMessage(event));
    this.mainWindow.handleHelp();
}