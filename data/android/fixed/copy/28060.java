public void onClick(android.content.DialogInterface dialog, int id) {
    tasks.remove(touchedTask);
    setUpTasksWithNewTasks();
    taskAdapter.notifyDataSetChanged();
    com.todome.ToDoMeActivity.writeTasks(ToDoMeActivity.tasks);
}