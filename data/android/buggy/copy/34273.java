@com.google.common.eventbus.Subscribe
private void handleTaskPanelSelectionChangedEvent(seedu.doit.commons.events.ui.TaskPanelSelectionChangedEvent event) {
    seedu.doit.ui.UiManager.logger.info(seedu.doit.commons.core.LogsCenter.getEventHandlingLogMessage(event));
    mainWindow.loadTaskPage(event.getNewSelection());
}