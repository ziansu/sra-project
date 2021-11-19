public java.util.List<com.edu.bit.nemare.todoapp.data.Task> getCachedTasks() {
    return (mCachedTasks) == null ? null : new java.util.ArrayList<com.edu.bit.nemare.todoapp.data.Task>(mCachedTasks.values());
}