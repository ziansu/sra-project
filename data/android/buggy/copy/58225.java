@java.lang.Override
public void widgetSelected(final org.eclipse.swt.events.SelectionEvent event) {
    if (useFilterTextRadio.getSelection()) {
        useFileTextRadio.setSelection(false);
        updateSqlText();
    }
}