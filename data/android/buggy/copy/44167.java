public <T> void suspendTask(api.Task<T> task, long taskId, boolean mode) {
    this.waitingQueue.put(taskId, task);
}