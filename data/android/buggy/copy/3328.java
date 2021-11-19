@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    uploadAgent.setSelection((!(connectAgent.getSelection())));
    setDirty();
    updateUI();
}