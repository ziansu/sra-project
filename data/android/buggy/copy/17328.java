@java.lang.Override
public synchronized void deleteTask(todolist.model.task.ReadOnlyTask target) throws todolist.model.task.UniqueTaskList.TaskNotFoundException {
    todoList.removeTask(target);
    updateFilteredTaskListToShowWithStatus(todolist.model.ModelManager.INCOMPLETE_STATUS);
    indicateToDoListChanged();
}