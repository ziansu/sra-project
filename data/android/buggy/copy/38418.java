public void addNewTask(application.Task taskToAdd) {
    searchList.clear();
    taskList.add(taskToAdd);
    sort(taskList);
    file.clear();
    file.saveToFile(tasksToStrings(taskList));
}