public Task getTask(int i) {
    if (i < (taskBatch.length))
        return taskBatch[i];
    
    return null;
}