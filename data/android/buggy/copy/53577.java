@java.lang.Override
protected javax.swing.JComponent runVisualization(org.rapidprom.ioobjects.XLogIOObject ioObject) {
    org.processmining.plugins.log.ui.logdialog.LogDialogInitializer i = new org.processmining.plugins.log.ui.logdialog.LogDialogInitializer();
    org.processmining.plugins.log.ui.logdialog.SlickerOpenLogSettings o = new org.processmining.plugins.log.ui.logdialog.SlickerOpenLogSettings();
    return o.showLogVis(ioObject.getPluginContext(), ioObject.getArtifact());
}