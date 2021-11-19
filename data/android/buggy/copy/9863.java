@java.lang.Override
public org.eclipse.core.runtime.IStatus execute(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) throws org.eclipse.core.commands.ExecutionException {
    oldOrder = this.orderedModules;
    this.orderedModules = newOrder;
    bundleTableViewer.setInput(orderedModules);
    return org.eclipse.core.runtime.Status.OK_STATUS;
}