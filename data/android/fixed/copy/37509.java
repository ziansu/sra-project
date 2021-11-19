public void addRepeatingGLTask(java.util.concurrent.Callable<?> task) {
    if (task == null)
        throw new java.lang.NullPointerException("Passed task intolerably null.");
    
    synchronized(repeatingGLTasks) {
        if (repeatingGLTasks.contains(task))
            return ;
        
        repeatingGLTasks.add(task);
    }
}