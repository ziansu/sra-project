public application.Task replaceTaskOnList(application.Task taskToUpdateWith, java.lang.String targetId) {
    application.Task originalTask = deleteTaskById(targetId);
    if (originalTask != null) {
        AddTaskBackToList(taskToUpdateWith);
    }
    return originalTask;
}