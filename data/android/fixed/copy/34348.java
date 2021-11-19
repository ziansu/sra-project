public <T> void clearShadow(long taskId, boolean mode) {
    if (mode == (space.SpaceImpl.MODE_SPACE))
        this.shadow.remove(taskId);
    
}