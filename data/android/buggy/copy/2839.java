public java.lang.Object execute(org.eclipse.core.commands.ExecutionEvent event) throws org.eclipse.core.commands.ExecutionException {
    final org.eclipse.ui.IWorkbenchWindow window = org.eclipse.ui.handlers.HandlerUtil.getActiveWorkbenchWindow(event);
    window.getActivePage().closeAllEditors(false);
    window.close();
    edu.rice.cs.hpc.viewer.window.ViewerWindowManager.removeWindow(window);
    return null;
}