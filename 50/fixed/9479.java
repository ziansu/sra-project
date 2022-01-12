@java.lang.Override
public int compare(org.ow2.proactive.scheduler.common.task.TaskState task1, org.ow2.proactive.scheduler.common.task.TaskState task2) {
    return java.lang.Long.compare(task1.getFinishedTime(), task2.getFinishedTime());
}