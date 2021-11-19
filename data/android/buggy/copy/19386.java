@java.lang.Override
public synchronized void completeTask(int index, typetask.model.task.ReadOnlyTask target) throws typetask.model.task.TaskList.TaskNotFoundException {
    taskManager.completeTask(index, target);
    indicateTaskManagerChanged();
}