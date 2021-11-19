public void destroyAllTaskByDate(java.time.LocalDateTime givenDate) {
    java.util.List<seedu.todo.models.Task> selectedTasks = getTaskByDate(givenDate);
    tasks.removeAll(selectedTasks);
}