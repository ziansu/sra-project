@java.lang.Override
public void runOutsideUIThread(final org.eclipse.core.runtime.IProgressMonitor monitor) {
    monitor.beginTask("Update issues", tasks.size());
    updateTask(monitor);
}