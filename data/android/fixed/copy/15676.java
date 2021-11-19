@java.lang.Override
public org.eclipse.core.runtime.IStatus runInUIThread(org.eclipse.core.runtime.IProgressMonitor monitor) {
    this.setName(computedName);
    return org.eclipse.core.runtime.Status.OK_STATUS;
}