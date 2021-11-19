private java.lang.Runnable getTaskFromAssigned() {
    java.util.LinkedList<java.lang.Runnable> assigned = threadTasksStorage.get();
    if (assigned.isEmpty()) {
        return null;
    }
    return alive.get() ? assigned.removeFirst() : null;
}