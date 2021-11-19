protected org.eclipse.swt.widgets.Shell getUsableShell() {
    if ((usableShell) != null) {
        return usableShell;
    }else {
        return new org.eclipse.swt.widgets.Shell(org.talend.commons.ui.gmf.util.DisplayUtils.getDisplay(), ((org.eclipse.swt.SWT.ON_TOP) | (org.eclipse.swt.SWT.TOP)));
    }
}