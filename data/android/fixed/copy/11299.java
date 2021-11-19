private java.lang.String undoRedoCreateTask() {
    Task task = new Task(this.commandDetails);
    tasks.add(this.commandDetails.getID(), task);
    storage.save(tasks);
    return displayAllTasks();
}