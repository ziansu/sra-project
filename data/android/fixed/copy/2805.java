@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    new org.nschmidt.ldparteditor.dialogs.primgen2.PrimGen2Dialog(getShell()).open();
    regainFocus();
}