public java.util.List<com.edu.bit.nemare.todoapp.data.Task> getCachedTasks() {
    return (mCachedTasks) == null ? null : new java.util.ArrayList(mCachedTasks.values());
}