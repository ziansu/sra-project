@java.lang.Override
public synchronized void addTask(todolist.model.task.Task task) throws UniqueTaskList.DuplicateTaskException {
    todoList.addTask(task);
    indicateToDoListChanged();
}