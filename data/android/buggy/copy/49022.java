@java.lang.Override
public org.eclipse.core.runtime.IStatus undo(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) throws org.eclipse.core.commands.ExecutionException {
    this.orderedModules = oldOrder;
    oldOrder = null;
    bundleTableViewer.setInput(orderedModules);
    return org.eclipse.core.runtime.Status.OK_STATUS;
}