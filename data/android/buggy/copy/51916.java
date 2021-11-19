public void addTaskList(java.util.ArrayList<ScheduleHacks.Task> taskList) {
    for (ScheduleHacks.Task newTask : taskList) {
        addTask(newTask, true);
    }
}