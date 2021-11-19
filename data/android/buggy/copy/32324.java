@java.lang.Override
public java.lang.Object execute(org.eclipse.core.commands.ExecutionEvent event) throws org.eclipse.core.commands.ExecutionException {
    java.lang.System.err.println("new winodw button clicked");
    org.gumtree.ui.service.multimonitor.IMultiMonitorManager mmManager = new org.gumtree.ui.service.multimonitor.support.MultiMonitorManager();
    mmManager.openWorkbenchWindow(java.lang.System.getProperty(au.gov.ansto.bragg.nbi.ui.launchers.OpenNewWindowHandler.ID_DEFAULT_NEW_WINDOW), 0, false);
    return null;
}