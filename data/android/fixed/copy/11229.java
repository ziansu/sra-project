private void addTask(main.data.Task task, main.logic.Logic.ListType type) {
    switch (type) {
        case ALL :
            allTasks.add(task);
            break;
        case COMPLETED :
            completedTasks.add(task);
            break;
        default :
            break;
    }
}