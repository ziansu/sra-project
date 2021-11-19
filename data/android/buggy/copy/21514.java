@java.lang.Override
public synchronized void deleteTask(seedu.ggist.model.task.ReadOnlyTask target) throws seedu.ggist.model.task.UniqueTaskList.TaskNotFoundException {
    taskManager.removeTask(target);
    updateListing();
    indicateTaskManagerChanged();
}