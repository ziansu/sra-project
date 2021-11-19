@java.lang.Override
public void clearData() {
    handleStateChange(todoList);
    todoList.resetData(new seedu.todolist.model.TodoList());
}