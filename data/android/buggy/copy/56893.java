public void notifyProcessedTask(int numCols) {
    totalProcessedTasks.incrementAndGet();
    LOG.info("Processed: {}/{} tasks, {}/{} subtasks, and {}/{} columns; {} failed tasks", totalProcessedTasks, totalTasksSubmitted, totalProcessedSubTasks, totalSubTasksSubmitted, totalProcessedColumns, totalColumns, totalFailedTasks);
    totalColumns.addAndGet(numCols);
}