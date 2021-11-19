public static void setLoadFailed(java.lang.String reason) {
    org.cytoscape.cyndex2.internal.task.OpenExternalAppTaskFactory.entry.setDisabled();
    org.cytoscape.cyndex2.internal.task.OpenExternalAppTaskFactory.entry.setToolTipText(reason);
    org.cytoscape.cyndex2.internal.task.OpenExternalAppTaskFactory.loadFailed = true;
}