private int deleteTasksByDate(seedu.taskmanager.commons.core.UnmodifiableObservableList<seedu.taskmanager.model.task.ReadOnlyTask> lastShownList) {
    int numDeletedTasks = 0;
    try {
        numDeletedTasks = model.deleteTasksDate(lastShownList);
    } catch (seedu.taskmanager.model.task.UniqueTaskList.TaskNotFoundException e) {
        assert false : seedu.taskmanager.logic.commands.DeleteCommand.MESSAGE_INVALID_TASK_DATE;
    }
    return numDeletedTasks;
}