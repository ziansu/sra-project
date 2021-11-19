@java.lang.Override
public java.util.ArrayList<Todo> viewTaskNoDate() {
    return taskBookNoDeadline = taskHandler.retrieveUniversalTodo();
}