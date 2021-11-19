@java.lang.Override
public void saveTaskManager(seedu.taskmanager.model.ReadOnlyTaskManager taskManager) throws java.io.IOException {
    try {
        saveTaskManager(taskManager, taskManagerStorage.getTaskManagerFilePath());
    } catch (java.io.IOException e) {
        raise(new seedu.taskmanager.commons.events.storage.DataSavingExceptionEvent(e));
        throw new java.io.IOException(e);
    }
}