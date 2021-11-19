@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent arg0) {
    java.lang.String filename = handleImportButton();
    if (filename != null) {
        controller.importCustomCommand();
        refresh();
    }
}