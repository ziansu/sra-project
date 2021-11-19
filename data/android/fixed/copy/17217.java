@org.junit.Test
public void dbShouldAddTodoList() throws java.lang.Exception {
    todo.javier.mera.todolist.model.TodoList todoList = createTodoList();
    long rowId = mDataSource.createTodoList(todoList, 0);
    junit.framework.Assert.assertTrue((rowId > (-1)));
}