public synchronized void editTask(seedu.ggist.model.task.ReadOnlyTask target, java.lang.String field, java.lang.String value) throws seedu.ggist.commons.exceptions.IllegalValueException, seedu.ggist.model.task.UniqueTaskList.TaskNotFoundException {
    taskManager.editTask(target, field, value);
    updateListing();
    sortFilteredList();
    indicateTaskManagerChanged();
}