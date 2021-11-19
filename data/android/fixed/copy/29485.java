public boolean cancelTask(com.hawky.jhttpload.Task task) {
    return tasks.remove(task.execTimeMillis, task);
}