private todo.javier.mera.todolist.model.TodoList createTodoList() {
    return new todo.javier.mera.todolist.model.TodoList(java.util.UUID.randomUUID().toString(), "My List", new java.util.Date().getTime(), 0);
}