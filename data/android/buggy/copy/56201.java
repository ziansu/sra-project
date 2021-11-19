private void dataBaseDelete(todolist.model.Task task) {
    try {
        dataBase.delete(task);
        logic.writeLog(((todolist.model.NormalCommandHandler.LOGGING_DELETING_TASK) + (task.getName().getName())));
    } catch (java.io.IOException e) {
    }
}