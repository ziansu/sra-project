public void setTaskComplete(boolean taskComplete) {
    this.taskComplete = taskComplete;
    if (taskComplete)
        this.completionTime = java.lang.System.currentTimeMillis();
    else
        this.completionTime = 0;
    
}