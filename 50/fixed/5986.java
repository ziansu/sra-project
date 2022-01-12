@java.lang.Override
public void associate(com.task.Task task) {
    this.task = task;
    if (task == null)
        return ;
    
    initialTime = task.getTaskTime();
    targetTime = 0;
    currentTime = initialTime;
}