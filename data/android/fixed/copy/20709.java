public static int openError(org.eclipse.swt.widgets.Shell parentShell, java.lang.String title, java.lang.String message, org.eclipse.core.runtime.IStatus status, int displayMask) {
    org.talend.designer.esb.runcontainer.ui.dialog.RuntimeErrorDialog dialog = new org.talend.designer.esb.runcontainer.ui.dialog.RuntimeErrorDialog(parentShell, title, message, status, displayMask);
    return dialog.open();
}