@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    if ((new org.nschmidt.ldparteditor.dialogs.primgen2.PrimGen2Dialog(getShell()).open()) == (org.eclipse.jface.dialogs.IDialogConstants.OK_ID)) {
    }
    regainFocus();
}