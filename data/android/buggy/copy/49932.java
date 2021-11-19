public void allocateTask(chessmaster.AllocatedTask task) {
    allocatedTasks.add(task);
    waste -= task.cost;
}