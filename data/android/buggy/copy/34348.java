public <T> void clearShadow(api.Task<T> task, long taskId, boolean mode) {
    if (mode == (space.SpaceImpl.MODE_SPACE))
        this.shadow.remove(task.taskId);
    
}