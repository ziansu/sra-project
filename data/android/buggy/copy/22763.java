@com.google.common.eventbus.Subscribe
public void handleJumpToListRequestEvent(werkbook.task.commons.events.ui.JumpToListRequestEvent event) {
    werkbook.task.ui.UiManager.logger.info(werkbook.task.commons.core.LogsCenter.getEventHandlingLogMessage(event));
    java.lang.System.out.println("JUMPING");
    mainWindow.getTaskListPanel().scrollTo(event.targetIndex);
}