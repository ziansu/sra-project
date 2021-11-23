@java.lang.Override
public void saveTaskManager(seedu.taskmanager.model.ReadOnlyTaskManager taskManager) throws java.io.IOException {
    saveTaskManager(taskManager, taskManagerStorage.getTaskManagerFilePath());
}