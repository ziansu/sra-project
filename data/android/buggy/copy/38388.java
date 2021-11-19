public boolean destroyAllTask() {
    tasks = new java.util.LinkedHashSet<seedu.todo.models.Task>();
    return save();
}