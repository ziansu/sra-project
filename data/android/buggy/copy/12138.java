public void addTask(Scheduler.Task task) {
    this.taskList.add(task);
    this.makespan += task.getDuration();
    (this.numerOfTasks)++;
}