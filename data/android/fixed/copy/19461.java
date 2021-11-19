@java.lang.Override
public void deleteTask(net.sourceforge.ganttproject.task.Task tasktoRemove) {
    net.sourceforge.ganttproject.task.Task container = getTaskHierarchy().getContainer(tasktoRemove);
    myTaskMap.removeTask(tasktoRemove);
    tasktoRemove.delete();
    fireTaskRemoved(container, tasktoRemove);
}