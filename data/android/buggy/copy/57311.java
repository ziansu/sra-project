private void populateToDoObject() {
    try {
        todoItem = getTodo();
        displayDetail();
    } catch (java.lang.AssertionError err) {
        todoItem = new com.nearsoft.androidschool.todoapp.models.ToDoContent();
        buttonViewConfig(true);
    }
}