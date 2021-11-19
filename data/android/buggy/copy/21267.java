public void addNewTask(TodoList toDolist) {
    java.lang.String content = view.takeTaskContent();
    TodoItem newTask = new TodoItem(content);
    toDoList.add(newTask);
}