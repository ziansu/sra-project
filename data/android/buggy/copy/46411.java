private int deleteTasksByName(int numDeletedTasks, seedu.taskmanager.commons.core.UnmodifiableObservableList<seedu.taskmanager.model.task.ReadOnlyTask> lastShownList) {
    try {
        numDeletedTasks = model.deleteTasksName(lastShownList, targetTaskName.trim());
    } catch (seedu.taskmanager.model.task.UniqueTaskList.TaskNotFoundException e) {
        assert false : seedu.taskmanager.logic.commands.DeleteCommand.MESSAGE_INVALID_TASK_NAME;
    }
    return numDeletedTasks;
}