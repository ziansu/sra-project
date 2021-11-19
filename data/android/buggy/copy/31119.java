@java.lang.Override
public void run(org.eclipse.core.runtime.IProgressMonitor monitor) throws org.eclipse.core.runtime.CoreException {
    try {
        _workingCopy.commit(monitor);
        refreshProject(monitor);
    } finally {
        monitor.done();
    }
}