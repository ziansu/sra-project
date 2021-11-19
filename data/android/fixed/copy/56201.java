private void dataBaseDelete(todolist.model.Task task) {
    try {
        dataBase.delete(task);
    } catch (java.io.IOException e) {
    }
}