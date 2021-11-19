@java.lang.Override
public void updateTask(todolist.model.task.ReadOnlyTask taskToEdit, todolist.model.task.ReadOnlyTask editedTask) throws UniqueTaskList.DuplicateTaskException {
    assert taskToEdit != null;
    assert editedTask != null;
    todoList.updateTask(taskToEdit, editedTask);
    updateFilteredTaskListToShowWithStatus(todolist.model.ModelManager.INCOMPLETE_STATUS);
    indicateToDoListChanged();
}