private pj.pr.task.TargetTask<?> getTask() {
    try {
        return this.taskQueue.poll(50, java.util.concurrent.TimeUnit.MILLISECONDS);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    return null;
}