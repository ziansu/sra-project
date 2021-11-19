public Task getTask(long i) {
    for (Task t : taskBatch)
        if ((t.getId()) == i)
            return t;
        
    
    return null;
}