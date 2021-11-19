private void populateToDoObject() {
    try {
        todoItem = getTodo();
        displayDetail();
        buttonViewConfig(false);
    } catch (java.lang.AssertionError err) {
        todoItem = new com.nearsoft.androidschool.todoapp.models.ToDoContent();
    }
}