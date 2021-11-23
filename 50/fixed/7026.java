@java.lang.Override
public void actionPerformed(com.intellij.openapi.actionSystem.AnActionEvent e) {
    com.intellij.openapi.project.Project project = e.getData(PlatformDataKeys.PROJECT);
    gerritToolWindow.reloadChanges(project, true);
    gerritUpdatesNotificationComponent.handleNotification();
}