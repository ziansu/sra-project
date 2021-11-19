@java.lang.Override
protected java.util.Deque<com.google.copybara.profiler.Task> childValue(java.util.Deque<com.google.copybara.profiler.Task> parentValue) {
    if ((stopped) || (parentValue.isEmpty())) {
        return null;
    }
    return createQueue(parentValue.element());
}